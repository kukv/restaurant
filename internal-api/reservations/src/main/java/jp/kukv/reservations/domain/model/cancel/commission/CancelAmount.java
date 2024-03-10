package jp.kukv.reservations.domain.model.cancel.commission;

/** キャンセル手数料 */
public class CancelAmount {

  Integer value;

  public CancelAmount(Integer value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  CancelAmount() {}
}
