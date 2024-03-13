package jp.kukv.reservations.presentation.api.receipt;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jp.kukv.reservations.application.coodinator.receipt.ReceiptCoordinator;
import jp.kukv.reservations.configuration.openapi.response.BadRequest;
import jp.kukv.reservations.configuration.openapi.response.InternalServerError;
import jp.kukv.reservations.configuration.openapi.response.Success;
import jp.kukv.reservations.domain.model.receipt.ReceiptNumber;
import org.springframework.http.MediaType;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/reservation/receipt")
@Tag(name = "reservation", description = "予約受付")
class ReceiptController {

  ReceiptCoordinator receiptCoordinator;

  @Operation(
      operationId = "予約受付",
      summary = "予約受付",
      description = "予約を受け付ける",
      requestBody =
          @io.swagger.v3.oas.annotations.parameters.RequestBody(
              description = "予約受付依頼",
              required = true,
              content =
                  @Content(
                      mediaType = MediaType.APPLICATION_JSON_VALUE,
                      schema = @Schema(implementation = ReceiptRequest.class))),
      responses = {
        @ApiResponse(
            responseCode = Success.code,
            description = Success.description,
            content =
                @Content(
                    mediaType = MediaType.APPLICATION_JSON_VALUE,
                    schema = @Schema(implementation = ReceiptResponse.class))),
        @ApiResponse(
            responseCode = BadRequest.code,
            description = BadRequest.description,
            content = @Content),
        @ApiResponse(
            responseCode = InternalServerError.code,
            description = InternalServerError.description,
            content = @Content),
      })
  @PostMapping
  ReceiptResponse receipt(@Validated @RequestBody ReceiptRequest request, BindingResult result) {
    if (result.hasErrors()) {
      throw new IllegalArgumentException(result.getAllErrors().toString());
    }

    ReceiptNumber receiptNumber =
        receiptCoordinator.receipt(request.visit, request.holder, request.course);
    return new ReceiptResponse(receiptNumber);
  }

  ReceiptController(ReceiptCoordinator receiptCoordinator) {
    this.receiptCoordinator = receiptCoordinator;
  }
}
