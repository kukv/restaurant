package jp.kukv.reservations1.domain.model.reservation;
//
// import static org.junit.jupiter.api.Assertions.assertEquals;
// import static org.junit.jupiter.api.Assertions.assertTrue;
//
// import jakarta.validation.ConstraintViolation;
// import jakarta.validation.Validation;
// import jakarta.validation.Validator;
// import java.time.LocalDate;
// import java.util.Set;
// import org.junit.jupiter.api.DisplayName;
// import org.junit.jupiter.api.Test;
//
// @DisplayName("予約日テスト")
// class ReservationDateTest {
//
//  Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
//
//  @DisplayName("予約日が当日日付の場合エラーにならない")
//  @Test
//  void valid() {
//    LocalDate now = LocalDate.now();
//    ReservationDate reservationDate = new ReservationDate(now);
//
//    Set<ConstraintViolation<ReservationDate>> violation = validator.validate(reservationDate);
//    assertEquals(0, violation.size());
//  }
//
//  @DisplayName("予約日が未来日付の場合エラーにならない")
//  @Test
//  void afterDate() {
//    LocalDate now = LocalDate.now();
//    LocalDate afterDate = now.plusDays(1);
//    ReservationDate reservationDate = new ReservationDate(afterDate);
//
//    Set<ConstraintViolation<ReservationDate>> violation = validator.validate(reservationDate);
//    assertEquals(0, violation.size());
//  }
//
//  @DisplayName("予約日が過去日付の場合エラーになる")
//  @Test
//  void beforeDate() {
//    LocalDate now = LocalDate.now();
//    LocalDate beforeDate = now.minusDays(1);
//    ReservationDate reservationDate = new ReservationDate(beforeDate);
//
//    Set<ConstraintViolation<ReservationDate>> violation = validator.validate(reservationDate);
//    assertEquals(1, violation.size());
//  }
//
//  @DisplayName("予約日が未来日付の場合trueを返す")
//  @Test
//  void 未来日付() {
//    LocalDate now = LocalDate.now();
//    LocalDate beforeDate = now.plusDays(1);
//    ReservationDate reservationDate = new ReservationDate(beforeDate);
//
//    assertTrue(reservationDate.is未来日付());
//  }
//
//  @DisplayName("予約日が過去日付の場合trueを返す")
//  @Test
//  void 過去日付() {
//    LocalDate now = LocalDate.now();
//    LocalDate beforeDate = now.minusDays(1);
//    ReservationDate reservationDate = new ReservationDate(beforeDate);
//
//    assertTrue(reservationDate.is過去日付());
//  }
// }
