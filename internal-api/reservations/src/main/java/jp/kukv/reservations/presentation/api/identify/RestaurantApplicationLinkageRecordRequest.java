package jp.kukv.reservations.presentation.api.identify;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jp.kukv.reservations.domain.model.identify.DinerId;
import jp.kukv.reservations.domain.model.reservation.ReservationId;

class RestaurantApplicationLinkageRecordRequest {

  @NotNull(message = "予約IDは必須")
  @Valid
  @JsonProperty
  ReservationId reservationId;

  @NotNull(message = "ディナー客IDは必須")
  @Valid
  @JsonProperty
  DinerId dinerId;

  RestaurantApplicationLinkageRecordRequest(ReservationId reservationId, DinerId dinerId) {
    this.reservationId = reservationId;
    this.dinerId = dinerId;
  }

  @Override
  public String toString() {
    return "RestaurantApplicationLinkageRecordRequest{"
        + "reservationId="
        + reservationId
        + ", dinerId="
        + dinerId
        + '}';
  }

  RestaurantApplicationLinkageRecordRequest() {}
}
