package jp.kukv.reservations.domain.model.cancel.collect;

import java.time.LocalDateTime;

/** キャンセル料徴収日時を生成するファクトリ */
class CollectedTimeFactory {
  CollectedTime create(LocalDateTime value) {
    if (value == null) return new NoSetCollectedTime();
    return new SetCollectedTime(value);
  }
}
