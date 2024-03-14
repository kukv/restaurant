package jp.kukv.reservations.domain.model.receipt.course;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jp.kukv.reservations.domain.model.receipt.course.cuisine.Cuisine;

/** 予約コース */
public class Course {

  @NotNull(message = "予約コース種別は必須")
  CourseType courseType;

  @Valid @JsonProperty Cuisine cuisine;

  Course(CourseType courseType, Cuisine cuisine) {
    this.courseType = courseType;
    this.cuisine = cuisine;
  }

  public boolean is席のみ予約() {
    return courseType.is席のみ予約();
  }

  public Cuisine cuisine() {
    return cuisine;
  }

  @Override
  public String toString() {
    return "Course{" + "courseType=" + courseType + ", cuisine=" + cuisine + '}';
  }

  Course() {}
}
