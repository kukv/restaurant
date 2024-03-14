package jp.kukv.reservations.domain.model.receipt.visit;

import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

/** 来店人数 */
class NumberOfVisitors {

  @NotNull(message = "来店人数は必須")
  @Min(value = 1, message = "来店人数は1人以上")
  @Max(value = 12, message = "来店人数は12人以下")
  @JsonValue
  Integer value;

  NumberOfVisitors(Integer value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  NumberOfVisitors() {}
}
