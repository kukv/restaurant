package jp.kukv.reservations.domain.model.receipt.visit;

import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;

/** 来店予定日 */
public class VisitDate {

  @NotNull(message = "来店予定日は必須")
  @FutureOrPresent(message = "来店予定日は当日以降")
  @JsonValue
  LocalDate value;

  VisitDate(LocalDate value) {
    this.value = value;
  }

  public boolean is未来日付() {
    return value.isAfter(LocalDate.now());
  }

  public boolean is過去日付() {
    return value.isBefore(LocalDate.now());
  }

  @Override
  public String toString() {
    return value.toString();
  }

  VisitDate() {}
}
