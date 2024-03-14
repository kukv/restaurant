package jp.kukv.reservations.domain.model.course.cuisine;

import jp.kukv.reservations.domain.model.receipt.course.cuisine.CuisineAmount;

public class CourseAmountDummyFactory {
  public static CuisineAmount create(Integer amount) {
    return new CuisineAmount(amount);
  }
}
