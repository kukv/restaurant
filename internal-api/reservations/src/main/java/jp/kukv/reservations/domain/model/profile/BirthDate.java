package jp.kukv.reservations.domain.model.profile;

import java.time.LocalDate;

/** 予約者生年月日 */
class BirthDate {

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
