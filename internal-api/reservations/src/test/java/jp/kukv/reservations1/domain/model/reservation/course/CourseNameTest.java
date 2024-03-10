package jp.kukv.reservations1.domain.model.reservation.course;
//
// import static org.junit.jupiter.api.Assertions.assertEquals;
//
// import jakarta.validation.ConstraintViolation;
// import jakarta.validation.Validation;
// import jakarta.validation.Validator;
// import java.util.Set;
// import org.junit.jupiter.api.DisplayName;
// import org.junit.jupiter.params.ParameterizedTest;
// import org.junit.jupiter.params.provider.ValueSource;
//
// @DisplayName("予約コース名テスト")
// class CourseNameTest {
//
//  Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
//
//  @DisplayName("予約コース名の形式が正しい場合エラーにならない")
//  @ParameterizedTest
//  @ValueSource(
//      strings = {
//        "テスト料理",
//        "あ",
//
// "テストテストテストテストテストテストテストテストテストテストテストテストテストテストテストテストテストテストテストテストテストテストテストテストテストテストテストテストテストテストテストテスト料理料理"
//      })
//  void valid(String value) {
//    CourseName courseName = new CourseName(value);
//
//    Set<ConstraintViolation<CourseName>> violation = validator.validate(courseName);
//    assertEquals(0, violation.size());
//  }
//
//  @DisplayName("予約コース名が空の場合エラーになる")
//  @ParameterizedTest
//  @ValueSource(strings = {""})
//  void empty(String value) {
//    CourseName courseName = new CourseName(value);
//
//    Set<ConstraintViolation<CourseName>> violation = validator.validate(courseName);
//    assertEquals(1, violation.size());
//  }
//
//  @DisplayName("予約コース名の桁数が101文字以上の場合エラーになる")
//  @ParameterizedTest
//  @ValueSource(
//      strings = {
//
// "テストテストテストテストテストテストテストテストテストテストテストテストテストテストテストテストテストテストテストテストテストテストテストテストテストテストテストテストテストテストテストテストテスト料理"
//      })
//  void over(String value) {
//    CourseName courseName = new CourseName(value);
//
//    Set<ConstraintViolation<CourseName>> violation = validator.validate(courseName);
//    assertEquals(1, violation.size());
//  }
// }
