package jp.kukv.reservations.domain.model.visit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import java.util.Set;
import jp.kukv.reservations.domain.model.receipt.visit.NumberOfVisitors;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class 来店人数テスト {

  Validator validator = Validation.buildDefaultValidatorFactory().getValidator();

  @ParameterizedTest
  @ValueSource(ints = {1, 12})
  void 来店人数の形式が正しい場合エラーにならない(Integer value) {
    NumberOfVisitors numberOfVisitors = new NumberOfVisitors(value);

    Set<ConstraintViolation<NumberOfVisitors>> violation = validator.validate(numberOfVisitors);
    assertEquals(0, violation.size());
  }

  @ParameterizedTest
  @ValueSource(ints = {0})
  void 来店人数が0人の場合エラーになる(Integer value) {
    NumberOfVisitors numberOfVisitors = new NumberOfVisitors(value);

    Set<ConstraintViolation<NumberOfVisitors>> violation = validator.validate(numberOfVisitors);
    assertEquals(1, violation.size());
  }

  @ParameterizedTest
  @ValueSource(ints = {13})
  void 来店人数が13人の場合エラーになる(Integer value) {
    NumberOfVisitors numberOfVisitors = new NumberOfVisitors(value);

    Set<ConstraintViolation<NumberOfVisitors>> violation = validator.validate(numberOfVisitors);
    assertEquals(1, violation.size());
  }
}
