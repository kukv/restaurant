package jp.kukv.reservations.domain.model.cancel.commission;

import java.time.LocalDateTime;

/** 予約キャンセル手数料徴収日時生成 */
class CollectTimeFactory {

  static CollectTime create(LocalDateTime value) {
    if (value == null) return new NoSetCollectTime();
    return new SetCollectTime(value);
  }
}
