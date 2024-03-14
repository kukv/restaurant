package jp.kukv.reservations.domain.model.cancel.policy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import jp.kukv.reservations.domain.model.cancel.commission.CancelAmount;
import jp.kukv.reservations.domain.model.course.cuisine.CourseAmountDummyFactory;
import jp.kukv.reservations.domain.model.receipt.course.cuisine.CuisineAmount;
import org.junit.jupiter.api.Test;

public class キャンセルポリシーテスト {

  @Test
  void コース料理の料金とキャンセル料率からキャンセル料請求金額を算出できる() {
    Policy policy = Policy.前日;

    CuisineAmount cuisineAmount = CourseAmountDummyFactory.create(10000);
    CancelAmount cancelAmount = policy.toCancelAmount(cuisineAmount);

    assertEquals("7500", cancelAmount.toString());
  }
}
