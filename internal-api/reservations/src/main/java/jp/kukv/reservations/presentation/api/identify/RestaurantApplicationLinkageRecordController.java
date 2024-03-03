package jp.kukv.reservations.presentation.api.identify;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jp.kukv.reservations.application.service.identify.RestaurantApplicationLinkageRecordService;
import jp.kukv.reservations.configuration.openapi.response.*;
import org.springframework.http.MediaType;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/identify")
@Tag(name = "restaurant-application-linkage", description = "レストランアプリ連携")
class RestaurantApplicationLinkageRecordController {

  RestaurantApplicationLinkageRecordService restaurantApplicationLinkageRecordService;

  @Operation(
      operationId = "レストランアプリとの連携",
      summary = "レストランアプリとの連携",
      description = "レストランアプリと予約情報を連携する",
      requestBody =
          @io.swagger.v3.oas.annotations.parameters.RequestBody(
              description = "レストランアプリとの連携",
              required = true,
              content =
                  @Content(
                      mediaType = MediaType.APPLICATION_JSON_VALUE,
                      schema =
                          @Schema(
                              implementation = RestaurantApplicationLinkageRecordRequest.class))),
      responses = {
        @ApiResponse(
            responseCode = Success.code,
            description = Success.description,
            content = @Content),
        @ApiResponse(
            responseCode = BadRequest.code,
            description = BadRequest.description,
            content = @Content),
        @ApiResponse(
            responseCode = NotFound.code,
            description = NotFound.description,
            content = @Content),
        @ApiResponse(
            responseCode = Conflict.code,
            description = Conflict.description,
            content = @Content),
        @ApiResponse(
            responseCode = InternalServerError.code,
            description = InternalServerError.description,
            content = @Content),
      })
  @PostMapping("/linkage")
  void linkage(
      @Validated @RequestBody RestaurantApplicationLinkageRecordRequest request,
      BindingResult result) {
    if (result.hasErrors()) {
      throw new IllegalArgumentException(result.getAllErrors().toString());
    }
    restaurantApplicationLinkageRecordService.linkage(request.reservationId, request.dinerId);
  }

  RestaurantApplicationLinkageRecordController(
      RestaurantApplicationLinkageRecordService restaurantApplicationLinkageRecordService) {
    this.restaurantApplicationLinkageRecordService = restaurantApplicationLinkageRecordService;
  }
}
