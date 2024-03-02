package jp.kukv.reservations.domain.model.cancel.policy;

/** キャンセルポリシー */
public class Policy {

  IntervalDays intervalDays;
  Rate rate;

  Policy(IntervalDays intervalDays, Rate rate) {
    this.intervalDays = intervalDays;
    this.rate = rate;
  }

  @Override
  public String toString() {
    return "Policy{" + "intervalDays=" + intervalDays + ", rate=" + rate + '}';
  }
}
