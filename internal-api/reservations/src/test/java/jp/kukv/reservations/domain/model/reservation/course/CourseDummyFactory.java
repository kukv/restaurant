package jp.kukv.reservations.domain.model.reservation.course;

public class CourseDummyFactory {
  public static Course create() {
    return new Course(new CourseName("テスト料理"));
  }
}
