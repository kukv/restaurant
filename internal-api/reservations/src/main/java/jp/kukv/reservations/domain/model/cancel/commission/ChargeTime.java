package jp.kukv.reservations.domain.model.cancel.commission;

import java.time.LocalDateTime;

/** 予約キャンセル手数料請求日時 */
class ChargeTime {

  LocalDateTime value;

  ChargeTime(LocalDateTime value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value.toString();
  }

  ChargeTime() {}
}
