package jp.kukv.reservations.domain.model.course.cuisine;

import static org.junit.jupiter.api.Assertions.assertEquals;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import java.util.Set;
import jp.kukv.reservations.domain.model.receipt.course.cuisine.CuisineAmount;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class 予約コース料理の料金テスト {

  Validator validator = Validation.buildDefaultValidatorFactory().getValidator();

  @ParameterizedTest
  @ValueSource(ints = {1, 10_000_000})
  void 予約コース料理の料金の形式が正しい場合エラーにならない(Integer value) {
    CuisineAmount cuisineAmount = new CuisineAmount(value);

    Set<ConstraintViolation<CuisineAmount>> violation = validator.validate(cuisineAmount);
    assertEquals(0, violation.size());
  }

  @ParameterizedTest
  @ValueSource(ints = {0})
  void 予約コース料理の料金が0人の場合エラーになる(Integer value) {
    CuisineAmount cuisineAmount = new CuisineAmount(value);

    Set<ConstraintViolation<CuisineAmount>> violation = validator.validate(cuisineAmount);
    assertEquals(1, violation.size());
  }

  @ParameterizedTest
  @ValueSource(ints = {10_000_001})
  void 予約コース料理の料金が10_000_001の場合エラーになる(Integer value) {
    CuisineAmount cuisineAmount = new CuisineAmount(value);

    Set<ConstraintViolation<CuisineAmount>> violation = validator.validate(cuisineAmount);
    assertEquals(1, violation.size());
  }
}
