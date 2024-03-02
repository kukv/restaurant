package jp.kukv.reservations.presentation.api.reservation;

import com.fasterxml.jackson.annotation.JsonProperty;
import jp.kukv.reservations.domain.model.reservation.ReservationId;

class ReservationResponse {

  @JsonProperty ReservationId reservationId;

  ReservationResponse(ReservationId reservationId) {
    this.reservationId = reservationId;
  }

  @Override
  public String toString() {
    return "ReservationResponse{" + "reservationId=" + reservationId + '}';
  }

  ReservationResponse() {}
}
