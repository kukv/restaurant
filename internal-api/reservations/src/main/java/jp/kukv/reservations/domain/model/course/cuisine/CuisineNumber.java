package jp.kukv.reservations.domain.model.course.cuisine;

import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;

/** 予約コース料理番号 */
class CuisineNumber {

  @Min(value = 1, message = "予約コース料理番号は1以上")
  @Max(value = 2_000_000_000, message = "予約コース料理番号は2,000,000,000以下")
  @JsonValue
  Integer value;

  CuisineNumber(Integer value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  CuisineNumber() {}
}
