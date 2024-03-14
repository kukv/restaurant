package jp.kukv.reservations.domain.model.receipt.course.cuisine;

import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;

/** 予約コース料理の料金 */
public class CuisineAmount {

  @Min(value = 1, message = "予約コース料理の料金は1円以上")
  @Max(value = 10_000_000, message = "予約コース料理の料金は10,000,000円以下")
  @JsonValue
  Integer value;

  CuisineAmount(Integer value) {
    this.value = value;
  }

  public Integer toInteger() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  CuisineAmount() {}
}
