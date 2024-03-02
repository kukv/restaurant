package jp.kukv.reservations.domain.model.cancel.collect;

import java.time.LocalDateTime;

/** 未徴収状態のキャンセル料徴収日時 */
public class NoSetCollectedTime implements CollectedTime {

  @Override
  public LocalDateTime value() {
    return null;
  }

  NoSetCollectedTime() {}
}
