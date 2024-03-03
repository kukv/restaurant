package jp.kukv.reservations.domain.model.reservation;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.validation.constraints.NotNull;
import java.util.UUID;

/** 予約ID */
public class ReservationId {

  @NotNull(message = "予約IDは必須")
  @JsonValue
  UUID value;

  ReservationId(UUID value) {
    this.value = value;
  }

  @JsonCreator
  ReservationId(String value) {
    this.value = UUID.fromString(value);
  }

  @Override
  public String toString() {
    return value.toString();
  }

  public static ReservationId create() {
    return new ReservationId(UUID.randomUUID());
  }
}
