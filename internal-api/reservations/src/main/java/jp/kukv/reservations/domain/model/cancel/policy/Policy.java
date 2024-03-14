package jp.kukv.reservations.domain.model.cancel.policy;

import java.math.BigDecimal;
import jp.kukv.reservations.domain.model.cancel.commission.CancelAmount;
import jp.kukv.reservations.domain.model.receipt.course.cuisine.CuisineAmount;

/** キャンセルポリシー */
enum Policy {
  当日(new Rate(BigDecimal.ONE)),
  前日(new Rate(new BigDecimal("0.75"))),
  前々日(new Rate(new BigDecimal("0.5"))),
  前々日以前(new Rate(BigDecimal.ZERO));

  Rate rate;

  Policy(Rate rate) {
    this.rate = rate;
  }

  CancelAmount toCancelAmount(CuisineAmount cuisineAmount) {
    BigDecimal amount = BigDecimal.valueOf(cuisineAmount.toInteger(), 0);
    BigDecimal fee = amount.multiply(rate.value);
    return new CancelAmount(fee.intValue());
  }
}
