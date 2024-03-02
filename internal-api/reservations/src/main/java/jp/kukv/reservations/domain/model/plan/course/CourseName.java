package jp.kukv.reservations.domain.model.plan.course;

/** 予約コース名 */
class CourseName {

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
