package jp.kukv.reservations.domain.model.identify;

import static org.junit.jupiter.api.Assertions.assertEquals;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import java.util.Set;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@DisplayName("ディナー客IDテスト")
class DinerIdTest {

  Validator validator = Validation.buildDefaultValidatorFactory().getValidator();

  @DisplayName("ディナー客IDが正しい形式の場合エラーにならない")
  @ParameterizedTest
  @ValueSource(ints = {1, 2_000_000_000})
  void valid(Integer value) {
    DinerId dinerId = new DinerId(value);

    Set<ConstraintViolation<DinerId>> violation = validator.validate(dinerId);
    assertEquals(0, violation.size());
  }

  @DisplayName("ディナー客IDが0以下の場合エラーになる")
  @ParameterizedTest
  @ValueSource(ints = {0, -1})
  void below(Integer value) {
    DinerId dinerId = new DinerId(value);

    Set<ConstraintViolation<DinerId>> violation = validator.validate(dinerId);
    assertEquals(1, violation.size());
  }

  @DisplayName("ディナー客IDが0以下の場合エラーになる")
  @ParameterizedTest
  @ValueSource(ints = {2_000_000_001})
  void over(Integer value) {
    DinerId dinerId = new DinerId(value);

    Set<ConstraintViolation<DinerId>> violation = validator.validate(dinerId);
    assertEquals(1, violation.size());
  }
}
