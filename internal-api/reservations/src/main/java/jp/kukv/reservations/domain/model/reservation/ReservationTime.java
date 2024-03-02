package jp.kukv.reservations.domain.model.reservation;

import java.time.LocalTime;

/** 予約時刻 */
class ReservationTime {

  LocalTime value;

  ReservationTime(LocalTime value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value.toString();
  }
}
