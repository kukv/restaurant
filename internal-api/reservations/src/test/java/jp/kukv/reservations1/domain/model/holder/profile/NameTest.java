package jp.kukv.reservations1.domain.model.holder.profile;
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
// @DisplayName("予約者氏名テスト")
// class NameTest {
//
//  Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
//
//  @DisplayName("予約者氏名の形式が正しい場合エラーにならない")
//  @ParameterizedTest
//  @ValueSource(
//      strings = {"山", "山田太郎", "山田 太郎", "山田山田山田山田山田山田山田山田山田山田山田山田山田山田山田山田山田山田山田山田山田山田山田山田山田"})
//  void valid(String value) {
//    Name name = new Name(value);
//
//    Set<ConstraintViolation<Name>> violation = validator.validate(name);
//    assertEquals(0, violation.size());
//  }
//
//  @DisplayName("予約者氏名が空の場合エラーになる")
//  @ParameterizedTest
//  @ValueSource(strings = {""})
//  void empty(String value) {
//    Name name = new Name(value);
//
//    Set<ConstraintViolation<Name>> violation = validator.validate(name);
//    assertEquals(1, violation.size());
//  }
//
//  @DisplayName("予約者氏名の桁数が51文字以上の場合エラーになる")
//  @ParameterizedTest
//  @ValueSource(strings = {"山田山田山田山田山田山田山田山田山田山田山田山田山田山田山田山田山田山田山田山田山田山田山田山田山田山"})
//  void over(String value) {
//    Name name = new Name(value);
//
//    Set<ConstraintViolation<Name>> violation = validator.validate(name);
//    assertEquals(1, violation.size());
//  }
// }
