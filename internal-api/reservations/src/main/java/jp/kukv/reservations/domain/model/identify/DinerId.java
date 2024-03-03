package jp.kukv.reservations.domain.model.identify;

import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.validation.constraints.NotNull;

/** ディナー客ID */
public class DinerId {

  @NotNull(message = "ディナー客IDは必須")
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
