package jp.kukv.reservations.domain.model.course.cuisine;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/** 予約コース料理 */
public class Cuisine {

  @NotNull(message = "予約コース料理番号は必須")
  @Valid
  @JsonProperty
  CuisineNumber cuisineNumber;

  @NotNull(message = "予約コース料理の料金は必須")
  @Valid
  @JsonProperty
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
