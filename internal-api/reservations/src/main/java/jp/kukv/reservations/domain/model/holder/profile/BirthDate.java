package jp.kukv.reservations.domain.model.holder.profile;

import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import java.time.LocalDate;

/** 生年月日 */
class BirthDate {

  @NotNull(message = "生年月日は必須")
  @Past(message = "生年月日は当日以前")
  @JsonValue
  LocalDate value;

  BirthDate(LocalDate value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value.toString();
  }

  BirthDate() {}
}
