package jp.kukv.reservations.domain.model.reservation.course;

import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.validation.constraints.NotEmpty;
import org.hibernate.validator.constraints.Length;

/** 予約コース名 */
class CourseName {

  @NotEmpty(message = "コース名は必須")
  @Length(max = 100, message = "コース名は100文字以内")
  @JsonValue
  String value;

  CourseName(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }

  CourseName() {}
}
