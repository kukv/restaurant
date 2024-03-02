package jp.kukv.reservations.domain.model.reservation;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.Valid;
import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.NotNull;
import java.time.Duration;
import java.time.LocalTime;
import jp.kukv.reservations.domain.model.reservation.course.Course;

/** 予約 */
public class Reservation {

  @NotNull(message = "予約種別は必須")
  @Valid
  ReservationType type;

  @NotNull(message = "予約日は必須")
  @Valid
  @JsonProperty
  ReservationDate date;

  @NotNull(message = "予約時刻は必須")
  @Valid
  @JsonProperty
  ReservationTime time;

  @NotNull(message = "コースは必須")
  @Valid
  @JsonProperty
  Course course;

  Reservation(ReservationType type, ReservationDate date, ReservationTime time, Course course) {
    this.type = type;
    this.date = date;
    this.time = time;
    this.course = course;
  }

  @AssertTrue(message = "予約日時は当日の30分以上前であること")
  private boolean isReservationDateTimeValidate() {
    if (!date.is当日()) return true;

    LocalTime now = LocalTime.now();
    Duration duration = Duration.between(now, time.value);

    long diff = duration.toMinutes();
    return 30 < diff;
  }

  public Course course() {
    return course;
  }

  @Override
  public String toString() {
    return "Reservation{"
        + "type="
        + type
        + ", date="
        + date
        + ", time="
        + time
        + ", course="
        + course
        + '}';
  }

  Reservation() {}
}
