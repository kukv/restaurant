package jp.kukv.reservations.domain.model.visit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import java.time.LocalDate;
import java.util.Set;
import jp.kukv.reservations.domain.model.receipt.visit.VisitDate;
import org.junit.jupiter.api.Test;

class 来店予定日テスト {

  Validator validator = Validation.buildDefaultValidatorFactory().getValidator();

  @Test
  void 来店予定日が当日日付の場合エラーにならない() {
    LocalDate now = LocalDate.now();
    VisitDate visitDate = new VisitDate(now);

    Set<ConstraintViolation<VisitDate>> violation = validator.validate(visitDate);
    assertEquals(0, violation.size());
  }

  @Test
  void 予約日が未来日付の場合エラーにならない() {
    LocalDate now = LocalDate.now();
    LocalDate afterDate = now.plusDays(1);
    VisitDate visitDate = new VisitDate(afterDate);

    Set<ConstraintViolation<VisitDate>> violation = validator.validate(visitDate);
    assertEquals(0, violation.size());
  }

  @Test
  void 予約日が過去日付の場合エラーになる() {
    LocalDate now = LocalDate.now();
    LocalDate beforeDate = now.minusDays(1);
    VisitDate visitDate = new VisitDate(beforeDate);

    Set<ConstraintViolation<VisitDate>> violation = validator.validate(visitDate);
    assertEquals(1, violation.size());
  }
}
