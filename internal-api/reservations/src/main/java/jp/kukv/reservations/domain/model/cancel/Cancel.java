package jp.kukv.reservations.domain.model.cancel;

import jp.kukv.reservations.domain.model.cancel.commission.Commission;

/** 予約キャンセル */
class Cancel {
  Reason reason;
  CanceledTime canceledTime;

  Commission commission;

  Cancel(Reason reason, CanceledTime canceledTime, Commission commission) {
    this.reason = reason;
    this.canceledTime = canceledTime;
    this.commission = commission;
  }

  @Override
  public String toString() {
    return "Cancel{"
        + "reason="
        + reason
        + ", canceledTime="
        + canceledTime
        + ", commission="
        + commission
        + '}';
  }

  Cancel() {}
}
