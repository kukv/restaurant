package jp.kukv.reservations.domain.model.course.cuisine;

import static org.junit.jupiter.api.Assertions.assertEquals;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import java.util.Set;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class 予約コース料理番号テスト {

  Validator validator = Validation.buildDefaultValidatorFactory().getValidator();

  @ParameterizedTest
  @ValueSource(ints = {1, 2_000_000_000})
  void 予約コース料理番号の形式が正しい場合エラーにならない(Integer value) {
    CuisineNumber cuisineNumber = new CuisineNumber(value);

    Set<ConstraintViolation<CuisineNumber>> violation = validator.validate(cuisineNumber);
    assertEquals(0, violation.size());
  }

  @ParameterizedTest
  @ValueSource(ints = {0})
  void 予約コース料理番号が0人の場合エラーになる(Integer value) {
    CuisineNumber cuisineNumber = new CuisineNumber(value);

    Set<ConstraintViolation<CuisineNumber>> violation = validator.validate(cuisineNumber);
    assertEquals(1, violation.size());
  }

  @ParameterizedTest
  @ValueSource(ints = {2_000_000_001})
  void 予約コース料理番号が2_000_000_001の場合エラーになる(Integer value) {
    CuisineNumber cuisineNumber = new CuisineNumber(value);

    Set<ConstraintViolation<CuisineNumber>> violation = validator.validate(cuisineNumber);
    assertEquals(1, violation.size());
  }
}
