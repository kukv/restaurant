package jp.kukv.reservations.domain.model.holder.profile;

import java.time.LocalDate;

/** 生年月日 */
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
