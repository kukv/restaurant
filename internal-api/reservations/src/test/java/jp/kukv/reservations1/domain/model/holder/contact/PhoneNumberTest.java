package jp.kukv.reservations1.domain.model.holder.contact;
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
// @DisplayName("予約者電話番号テスト")
// class PhoneNumberTest {
//
//  Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
//
//  @DisplayName("予約者電話番号の形式が正しい場合エラーにならない")
//  @ParameterizedTest
//  @ValueSource(strings = {"09012345678", "08012345678", "07012345678"})
//  void valid(String value) {
//    PhoneNumber phoneNumber = new PhoneNumber(value);
//
//    Set<ConstraintViolation<PhoneNumber>> violation = validator.validate(phoneNumber);
//    assertEquals(0, violation.size());
//  }
//
//  @DisplayName("予約者電話番号が空の場合エラーになる")
//  @ParameterizedTest
//  @ValueSource(strings = {""})
//  void empty(String value) {
//    PhoneNumber phoneNumber = new PhoneNumber(value);
//
//    Set<ConstraintViolation<PhoneNumber>> violation = validator.validate(phoneNumber);
//    assertEquals(3, violation.size());
//  }
//
//  @DisplayName("予約者電話番号の桁数が10文字以下の場合エラーになる")
//  @ParameterizedTest
//  @ValueSource(strings = {"0901234567"})
//  void below(String value) {
//    PhoneNumber phoneNumber = new PhoneNumber(value);
//
//    Set<ConstraintViolation<PhoneNumber>> violation = validator.validate(phoneNumber);
//    assertEquals(1, violation.size());
//  }
//
//  @DisplayName("予約者電話番号の桁数が12文字以上の場合エラーになる")
//  @ParameterizedTest
//  @ValueSource(strings = {"090123456789"})
//  void over(String value) {
//    PhoneNumber phoneNumber = new PhoneNumber(value);
//
//    Set<ConstraintViolation<PhoneNumber>> violation = validator.validate(phoneNumber);
//    assertEquals(1, violation.size());
//  }
//
//  @DisplayName("予約者電話番号のの形式が不正の場合エラーになる")
//  @ParameterizedTest
//  @ValueSource(strings = {"0901234567a", "a9012345678", "09012aa5678", "asdfghjklqw"})
//  void mismatch(String value) {
//    PhoneNumber phoneNumber = new PhoneNumber(value);
//
//    Set<ConstraintViolation<PhoneNumber>> violation = validator.validate(phoneNumber);
//    assertEquals(1, violation.size());
//  }
// }
