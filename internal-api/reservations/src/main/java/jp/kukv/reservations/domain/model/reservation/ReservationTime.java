package jp.kukv.reservations.domain.model.reservation;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.validation.constraints.NotNull;
import java.time.LocalTime;

/** 予約時刻 */
class ReservationTime {

  @NotNull(message = "予約時刻は必須")
  @JsonValue
  LocalTime value;

  @JsonCreator
  ReservationTime(LocalTime value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value.toString();
  }

  ReservationTime() {}
}
