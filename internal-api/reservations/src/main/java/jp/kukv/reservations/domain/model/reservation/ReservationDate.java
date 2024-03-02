package jp.kukv.reservations.domain.model.reservation;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;

/** 予約日 */
class ReservationDate {

  @NotNull(message = "予約日は必須")
  @FutureOrPresent(message = "日付は当日か当日以降であること")
  @JsonValue
  LocalDate value;

  @JsonCreator
  ReservationDate(LocalDate value) {
    this.value = value;
  }

  boolean is当日() {
    return value.isEqual(LocalDate.now());
  }

  @Override
  public String toString() {
    return value.toString();
  }

  ReservationDate() {}
}
