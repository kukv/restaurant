package jp.kukv.reservations.domain.model.cancel.commission;

import java.time.LocalDateTime;

/** 未徴収状態の予約キャンセル手数料徴収日時 */
class NoSetCollectTime implements CollectTime {

  @Override
  public LocalDateTime value() {
    throw new UnsupportedOperationException("未徴収状態の為このメソッドの呼び出しはサポートしていない");
  }

  NoSetCollectTime() {}
}
