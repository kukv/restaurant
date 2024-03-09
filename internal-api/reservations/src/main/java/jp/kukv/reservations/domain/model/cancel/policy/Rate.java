package jp.kukv.reservations.domain.model.cancel.policy;

import java.math.BigDecimal;

/** キャンセル手数料率 */
class Rate {

  BigDecimal value;

  Rate(BigDecimal value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value.toPlainString();
  }

  Rate() {}
}
