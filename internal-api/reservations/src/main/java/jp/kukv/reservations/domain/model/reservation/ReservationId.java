package jp.kukv.reservations.domain.model.reservation;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.UUID;

/** 予約ID */
public class ReservationId {

  @JsonValue UUID value;

  ReservationId(UUID value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value.toString();
  }

  public static ReservationId create() {
    return new ReservationId(UUID.randomUUID());
  }
}
