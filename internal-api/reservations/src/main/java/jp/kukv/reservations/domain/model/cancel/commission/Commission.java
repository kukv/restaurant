package jp.kukv.reservations.domain.model.cancel.commission;

/** 予約キャンセル手数料 */
public class Commission {

  CancelAmount cancelAmount;
  ChargeTime chargeTime;
  CollectTime collectTime;

  Commission(CancelAmount cancelAmount, ChargeTime chargeTime, CollectTime collectTime) {
    this.cancelAmount = cancelAmount;
    this.chargeTime = chargeTime;
    this.collectTime = collectTime;
  }

  @Override
  public String toString() {
    return "Commission{"
        + "cancelAmount="
        + cancelAmount
        + ", chargeTime="
        + chargeTime
        + ", collectTime="
        + collectTime
        + '}';
  }

  Commission() {}
}
