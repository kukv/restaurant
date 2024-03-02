package jp.kukv.reservations.domain.model.reservation.course;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/** コース */
public class Course {

  @NotNull(message = "コース名は必須")
  @Valid
  @JsonProperty
  CourseName courseName;

  Course(CourseName courseName) {
    this.courseName = courseName;
  }

  @Override
  public String toString() {
    return "Course{" + "courseName=" + courseName + '}';
  }

  Course() {}
}
