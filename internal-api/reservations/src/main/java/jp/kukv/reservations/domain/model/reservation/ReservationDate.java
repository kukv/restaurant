package jp.kukv.reservations.domain.model.reservation;

import java.time.LocalDate;

/** 予約日 */
class ReservationDate {

  LocalDate value;

  ReservationDate(LocalDate value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value.toString();
  }
}
