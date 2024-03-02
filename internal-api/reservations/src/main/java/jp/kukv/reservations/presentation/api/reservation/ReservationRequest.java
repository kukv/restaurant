package jp.kukv.reservations.presentation.api.reservation;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jp.kukv.reservations.domain.model.holder.Holder;
import jp.kukv.reservations.domain.model.reservation.Reservation;

class ReservationRequest {

  @NotNull(message = "予約は必須")
  @Valid
  @JsonProperty
  Reservation reservation;

  @NotNull(message = "予約者は必須")
  @Valid
  @JsonProperty
  Holder holder;

  ReservationRequest(Reservation reservation, Holder holder) {
    this.reservation = reservation;
    this.holder = holder;
  }

  @Override
  public String toString() {
    return "ReservationRequest{" + "reservation=" + reservation + ", holder=" + holder + '}';
  }

  ReservationRequest() {}
}
