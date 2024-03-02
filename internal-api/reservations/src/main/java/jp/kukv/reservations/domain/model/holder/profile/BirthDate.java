package jp.kukv.reservations.domain.model.holder.profile;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;

/** 予約者生年月日 */
class BirthDate {

  @NotNull(message = "予約者生年月日は必須")
  @JsonValue
  LocalDate value;

  @JsonCreator
  BirthDate(LocalDate value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value.toString();
  }

  BirthDate() {}
}
