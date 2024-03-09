package jp.kukv.reservations.domain.model.visit;

import java.time.LocalDate;

/** 来店予定日 */
public class VisitDate {

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
