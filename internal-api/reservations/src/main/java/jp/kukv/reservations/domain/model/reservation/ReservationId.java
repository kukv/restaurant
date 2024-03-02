package jp.kukv.reservations.domain.model.reservation;

import java.util.UUID;

/** 予約ID */
class ReservationId {

  UUID value;

  ReservationId(UUID value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value.toString();
  }

  static ReservationId create() {
    return new ReservationId(UUID.randomUUID());
  }
}
