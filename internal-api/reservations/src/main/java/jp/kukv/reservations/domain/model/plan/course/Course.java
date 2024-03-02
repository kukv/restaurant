package jp.kukv.reservations.domain.model.plan.course;

/** コース */
class Course {

  CourseName courseName;

  Course(CourseName courseName) {
    this.courseName = courseName;
  }

  @Override
  public String toString() {
    return "Course{" + "courseName=" + courseName + '}';
  }
}
