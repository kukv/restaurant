package jp.kukv.reservations.infrastructure.datasource.receipt.course;

class CourseIdentifier {

  Integer value;

  CourseIdentifier(Integer value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  static CourseIdentifier empty() {
    return new CourseIdentifier();
  }

  CourseIdentifier() {}
}
