package jp.kukv.reservations.domain.model.receipt.visit;

import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.validation.constraints.NotNull;
import java.time.Duration;
import java.time.LocalTime;

/** 来店予定時刻 */
public class VisitTime {

  @NotNull(message = "来店予定時刻は必須")
  @JsonValue
  LocalTime value;

  VisitTime(LocalTime value) {
    this.value = value;
  }

  public boolean is来店予定時刻が現在時刻の30分以上前() {
    LocalTime now = LocalTime.now();
    Duration duration = Duration.between(value, now);

    long diff = duration.toMinutes();
    return 30 <= diff;
  }

  @Override
  public String toString() {
    return value.toString();
  }

  VisitTime() {}
}
