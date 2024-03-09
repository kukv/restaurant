package jp.kukv.reservations1.domain.model.reservation;
//
// import static org.junit.jupiter.api.Assertions.assertThrows;
//
// import java.time.LocalDate;
// import java.time.LocalTime;
// import jp.kukv.reservations.domain.model.reservation.course.Course;
// import jp.kukv.reservations.domain.model.reservation.course.CourseDummyFactory;
// import org.junit.jupiter.api.DisplayName;
// import org.junit.jupiter.api.Test;
//
// @DisplayName("予約受付ルールテスト")
// class ReservationRuleTest {
//
//  @DisplayName("予約日時が不正の場合エラーとなる")
//  @Test
//  void 予約日時が不正の場合エラーとなる() {
//    Course course = CourseDummyFactory.create();
//    ReservationDate reservationDate = new ReservationDate(LocalDate.now());
//    ReservationTime reservationTime = new ReservationTime(LocalTime.now().minusMinutes(29));
//    ReservationType type = ReservationType.席のみ予約;
//
//    Reservation reservation = new Reservation(type, reservationDate, reservationTime, course);
//    ReservationRule rule = new ReservationRule(reservation);
//
//    assertThrows(IllegalArgumentException.class, rule::check);
//  }
// }
