package jp.kukv.reservations.domain.model.course;

import jp.kukv.reservations.domain.model.course.cuisine.Cuisine;

/** 予約コース */
class Course {

  CourseType courseType;
  Cuisine cuisine;

  Course(CourseType courseType, Cuisine cuisine) {
    this.courseType = courseType;
    this.cuisine = cuisine;
  }

  @Override
  public String toString() {
    return "Course{" + "courseType=" + courseType + ", cuisine=" + cuisine + '}';
  }

  Course() {}
}
