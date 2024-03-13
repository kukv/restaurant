package jp.kukv.reservations.domain.model.holder.profile;

import static org.junit.jupiter.api.Assertions.assertEquals;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import java.util.Set;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class 予約者氏名テスト {

  Validator validator = Validation.buildDefaultValidatorFactory().getValidator();

  @ParameterizedTest
  @ValueSource(strings = {"山", "山田太郎", "山田 太郎", "山田山田山田山田山田山田山田山田山田山田山田山田山田山田山田"})
  void 予約者氏名が正しい形式の場合エラーにならない(String value) {
    Name name = new Name(value);

    Set<ConstraintViolation<Name>> violation = validator.validate(name);
    assertEquals(0, violation.size());
  }

  @ParameterizedTest
  @ValueSource(strings = {""})
  void 予約者氏名が空文字の場合エラーになる(String value) {
    Name name = new Name(value);

    Set<ConstraintViolation<Name>> violation = validator.validate(name);
    assertEquals(1, violation.size());
  }

  @ParameterizedTest
  @ValueSource(strings = {"山田太郎山田太郎山田太郎山田太郎山田太郎山田太郎山田太郎山田太"})
  void 予約者氏名が31文字以上の場合エラーになる(String value) {
    Name name = new Name(value);

    Set<ConstraintViolation<Name>> violation = validator.validate(name);
    assertEquals(1, violation.size());
  }
}
