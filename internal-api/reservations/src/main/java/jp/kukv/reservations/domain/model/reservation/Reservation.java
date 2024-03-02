package jp.kukv.reservations.domain.model.reservation;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
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

  boolean is当日30分以上前の予約() {
    if (date.is未来日付()) return true;
    if (date.is過去日付()) return false;
    return time.is予約時刻が30分以上前();
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
