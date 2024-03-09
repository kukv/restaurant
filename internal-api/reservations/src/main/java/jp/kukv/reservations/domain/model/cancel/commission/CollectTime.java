package jp.kukv.reservations.domain.model.cancel.commission;

import java.time.LocalDateTime;

/** 予約キャンセル手数料徴収日時を表すインターフェース */
interface CollectTime {
  LocalDateTime value();
}
