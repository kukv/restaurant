package jp.kukv.reservations.domain.model.cancel;

import java.time.LocalDateTime;

/** 予約キャンセル日時 */
class CanceledTime {

  LocalDateTime value;

  CanceledTime(LocalDateTime value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value.toString();
  }

  CanceledTime() {}
}
