package jp.kukv.reservations.domain.model.cancel;

import java.time.LocalDateTime;

/** キャンセル日時 */
class CanceledTime {

  LocalDateTime value;

  CanceledTime(LocalDateTime value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value.toString();
  }
}
