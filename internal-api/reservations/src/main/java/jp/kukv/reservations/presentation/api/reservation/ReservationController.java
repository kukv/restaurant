package jp.kukv.reservations.presentation.api.reservation;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jp.kukv.reservations.application.coordinator.reservation.ReservationCoordinator;
import jp.kukv.reservations.configuration.openapi.response.BadRequest;
import jp.kukv.reservations.configuration.openapi.response.InternalServerError;
import jp.kukv.reservations.configuration.openapi.response.Success;
import jp.kukv.reservations.domain.model.reservation.ReservationId;
import org.springframework.http.MediaType;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/reservation")
@Tag(name = "reservation", description = "予約")
class ReservationController {

  ReservationCoordinator reservationCoordinator;

  @Operation(
      operationId = "ディナー予約",
      summary = "ディナー予約",
      description = "ディナーを予約する",
      requestBody =
          @io.swagger.v3.oas.annotations.parameters.RequestBody(
              description = "ディナー予約依頼",
              required = true,
              content =
                  @Content(
                      mediaType = MediaType.APPLICATION_JSON_VALUE,
                      schema = @Schema(implementation = ReservationRequest.class))),
      responses = {
        @ApiResponse(
            responseCode = Success.code,
            description = Success.description,
            content =
                @Content(
                    mediaType = MediaType.APPLICATION_JSON_VALUE,
                    schema = @Schema(implementation = ReservationResponse.class))),
        @ApiResponse(
            responseCode = BadRequest.code,
            description = BadRequest.description,
            content = @Content),
        @ApiResponse(
            responseCode = InternalServerError.code,
            description = InternalServerError.description,
            content = @Content),
      })
  @PostMapping("/reserve")
  ReservationResponse reserve(
      @Validated @RequestBody ReservationRequest request, BindingResult result) {
    if (result.hasErrors()) {
      throw new IllegalArgumentException(result.getAllErrors().toString());
    }

    ReservationId reservationId =
        reservationCoordinator.reserve(request.reservation, request.holder);
    return new ReservationResponse(reservationId);
  }

  ReservationController(ReservationCoordinator reservationCoordinator) {
    this.reservationCoordinator = reservationCoordinator;
  }
}
