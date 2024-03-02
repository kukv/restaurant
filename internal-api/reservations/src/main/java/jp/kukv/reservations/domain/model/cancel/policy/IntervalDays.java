package jp.kukv.reservations.domain.model.cancel.policy;

/** 予約日からキャンセル日までの間隔 */
enum IntervalDays {
  予約日当日,
  予約日前日,
  予約日前日の2日前以前
}
