package jp.kukv.reservations.domain.model.cancel.collect;

import java.time.LocalDateTime;

/** キャンセル料徴収日時を表すインターフェース */
interface CollectedTime {

  LocalDateTime value();
}
