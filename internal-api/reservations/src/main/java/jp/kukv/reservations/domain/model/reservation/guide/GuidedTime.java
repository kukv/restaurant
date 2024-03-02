package jp.kukv.reservations.domain.model.reservation.guide;

import java.time.LocalDateTime;

/** 案内日時 */
class GuidedTime {

  LocalDateTime value;

  GuidedTime(LocalDateTime value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value.toString();
  }
}
