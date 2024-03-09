package jp.kukv.reservations.domain.model.course.cuisine;

/** 予約コース料理の料金 */
public class CuisineAmount {

  Integer value;

  CuisineAmount(Integer value) {
    this.value = value;
  }

  public Integer toInteger() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  CuisineAmount() {}
}
