package jp.kukv.reservations.domain.model.cancel.commission;

import java.time.LocalDateTime;

/** 徴収済状態の予約キャンセル手数料徴収日時 */
class SetCollectTime implements CollectTime {

  LocalDateTime value;

  SetCollectTime(LocalDateTime value) {
    this.value = value;
  }

  @Override
  public LocalDateTime value() {
    return value;
  }

  @Override
  public String toString() {
    return value.toString();
  }

  SetCollectTime() {}
}
