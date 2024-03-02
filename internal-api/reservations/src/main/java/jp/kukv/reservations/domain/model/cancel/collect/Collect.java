package jp.kukv.reservations.domain.model.cancel.collect;

/** キャンセル料徴収 */
public class Collect {

  Fee fee;
  CollectedTime collectedTime;

  Collect(Fee fee, CollectedTime collectedTime) {
    this.fee = fee;
    this.collectedTime = collectedTime;
  }

  @Override
  public String toString() {
    return "Collect{" + "fee=" + fee + ", collectedTime=" + collectedTime + '}';
  }
}
