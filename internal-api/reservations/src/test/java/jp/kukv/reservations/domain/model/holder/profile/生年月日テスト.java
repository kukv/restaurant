package jp.kukv.reservations.domain.model.holder.profile;

import static org.junit.jupiter.api.Assertions.assertEquals;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import java.time.LocalDate;
import java.util.Set;
import org.junit.jupiter.api.Test;

class 生年月日テスト {

  Validator validator = Validation.buildDefaultValidatorFactory().getValidator();

  @Test
  void 生年月日が前日以前の日付の場合エラーにならない() {
    LocalDate now = LocalDate.now();
    LocalDate beforeDate = now.minusDays(1);
    BirthDate birthDate = new BirthDate(beforeDate);

    Set<ConstraintViolation<BirthDate>> violation = validator.validate(birthDate);
    assertEquals(0, violation.size());
  }

  @Test
  void 生年月日が当日日付の場合エラーになる() {
    LocalDate now = LocalDate.now();
    BirthDate birthDate = new BirthDate(now);

    Set<ConstraintViolation<BirthDate>> violation = validator.validate(birthDate);
    assertEquals(1, violation.size());
  }

  @Test
  void 生年月日が翌日以降の日付の場合エラーになる() {
    LocalDate now = LocalDate.now();
    LocalDate afterDate = now.plusDays(1);
    BirthDate birthDate = new BirthDate(afterDate);

    Set<ConstraintViolation<BirthDate>> violation = validator.validate(birthDate);
    assertEquals(1, violation.size());
  }
}
