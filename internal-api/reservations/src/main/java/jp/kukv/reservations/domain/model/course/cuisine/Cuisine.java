package jp.kukv.reservations.domain.model.course.cuisine;

/** 予約コース料理 */
public class Cuisine {

  CuisineNumber cuisineNumber;
  CuisineAmount cuisineAmount;

  Cuisine(CuisineNumber cuisineNumber, CuisineAmount cuisineAmount) {
    this.cuisineNumber = cuisineNumber;
    this.cuisineAmount = cuisineAmount;
  }

  @Override
  public String toString() {
    return "Cuisine{" + "cuisineNumber=" + cuisineNumber + ", cuisineAmount=" + cuisineAmount + '}';
  }

  Cuisine() {}
}
