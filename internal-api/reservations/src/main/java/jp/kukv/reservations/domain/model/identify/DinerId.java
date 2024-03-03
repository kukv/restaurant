package jp.kukv.reservations.domain.model.identify;

import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

/** ディナー客ID */
public class DinerId {

  @NotNull(message = "ディナー客IDは必須")
  @Min(value = 1, message = "ディナー客IDは1以上")
  @Max(value = 2_000_000_000, message = "ディナー客IDは2,000,000,000以下")
  @JsonValue
  Integer value;

  DinerId(Integer value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  DinerId() {}

  public static DinerId empty() {
    return new DinerId();
  }
}
