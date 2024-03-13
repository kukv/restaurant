package jp.kukv.reservations.domain.model.visit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import java.util.Set;
import org.junit.jupiter.api.Test;

class 来店予定時刻テスト {

  Validator validator = Validation.buildDefaultValidatorFactory().getValidator();

  @Test
  void 来店予定時刻がnullの場合エラーになる() {
    VisitTime visitTime = new VisitTime(null);

    Set<ConstraintViolation<VisitTime>> violation = validator.validate(visitTime);
    assertEquals(1, violation.size());
  }
}
