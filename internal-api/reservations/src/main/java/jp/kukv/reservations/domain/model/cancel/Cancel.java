package jp.kukv.reservations.domain.model.cancel;

import jp.kukv.reservations.domain.model.cancel.collect.Collect;
import jp.kukv.reservations.domain.model.cancel.policy.Policy;

/** 予約キャンセル */
public class Cancel {

  CanceledTime canceledTime;
  Reason reason;
  Policy policy;
  Collect collect;

  Cancel(CanceledTime canceledTime, Reason reason, Policy policy, Collect collect) {
    this.canceledTime = canceledTime;
    this.reason = reason;
    this.policy = policy;
    this.collect = collect;
  }

  @Override
  public String toString() {
    return "Cancel{"
        + "canceledTime="
        + canceledTime
        + ", reason="
        + reason
        + ", policy="
        + policy
        + ", collect="
        + collect
        + '}';
  }
}
