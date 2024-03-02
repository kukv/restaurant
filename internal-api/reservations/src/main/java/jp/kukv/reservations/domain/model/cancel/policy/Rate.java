package jp.kukv.reservations.domain.model.cancel.policy;

import java.math.BigDecimal;

/** キャンセル料(%) */
class Rate {

  BigDecimal value;

  Rate(BigDecimal value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value.toPlainString();
  }
}
