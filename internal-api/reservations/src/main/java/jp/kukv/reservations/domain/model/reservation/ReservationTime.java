package jp.kukv.reservations.domain.model.reservation;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.validation.constraints.NotNull;
import java.time.Duration;
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

  boolean is予約時刻が30分以上前() {
    LocalTime now = LocalTime.now();
    Duration duration = Duration.between(value, now);

    long diff = duration.toMinutes();
    return 30 <= diff;
  }

  @Override
  public String toString() {
    return value.toString();
  }

  ReservationTime() {}
}
