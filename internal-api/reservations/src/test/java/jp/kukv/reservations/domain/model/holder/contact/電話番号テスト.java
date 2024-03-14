package jp.kukv.reservations.domain.model.holder.contact;

import static org.junit.jupiter.api.Assertions.assertEquals;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import java.util.Set;
import jp.kukv.reservations.domain.model.receipt.holder.contact.PhoneNumber;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class 電話番号テスト {

  Validator validator = Validation.buildDefaultValidatorFactory().getValidator();

  @ParameterizedTest
  @ValueSource(strings = {"09012345678"})
  void 電話番号の形式が正しい場合エラーにならない(String value) {
    PhoneNumber phoneNumber = new PhoneNumber(value);

    Set<ConstraintViolation<PhoneNumber>> violations = validator.validate(phoneNumber);
    assertEquals(0, violations.size());
  }

  @ParameterizedTest
  @ValueSource(strings = {""})
  void 電話番号が空の場合エラーになる(String value) {
    PhoneNumber phoneNumber = new PhoneNumber(value);

    Set<ConstraintViolation<PhoneNumber>> violations = validator.validate(phoneNumber);
    assertEquals(3, violations.size());
  }

  @ParameterizedTest
  @ValueSource(strings = {"090123456789", "0901234567"})
  void 電話番号が11桁以外の場合エラーになる(String value) {
    PhoneNumber phoneNumber = new PhoneNumber(value);

    Set<ConstraintViolation<PhoneNumber>> violations = validator.validate(phoneNumber);
    assertEquals(1, violations.size());
  }

  @ParameterizedTest
  @ValueSource(strings = {"0901234567a", "a9012345678", "09012aa5678", "asdfghjklqw"})
  void 電話番号の形式が不正の場合エラーになる(String value) {
    PhoneNumber phoneNumber = new PhoneNumber(value);

    Set<ConstraintViolation<PhoneNumber>> violations = validator.validate(phoneNumber);
    assertEquals(1, violations.size());
  }
}
