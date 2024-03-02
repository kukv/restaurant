package jp.kukv.reservations.domain.model.cancel.collect;

import java.time.LocalDateTime;

/** 徴収済み状態のキャンセル料徴収日時 */
class SetCollectedTime implements CollectedTime {

  LocalDateTime value;

  SetCollectedTime(LocalDateTime value) {
    this.value = value;
  }

  @Override
  public LocalDateTime value() {
    return null;
  }

  @Override
  public String toString() {
    return value.toString();
  }
}
