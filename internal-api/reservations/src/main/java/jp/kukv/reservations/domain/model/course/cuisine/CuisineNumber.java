package jp.kukv.reservations.domain.model.course.cuisine;

/** 予約コース料理番号 */
class CuisineNumber {

  Integer value;

  CuisineNumber(Integer value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  CuisineNumber() {}
}
