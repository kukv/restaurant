package jp.kukv.reservations.domain.model.holder.contact;

import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import org.hibernate.validator.constraints.Length;

/** 予約者電話番号 */
class PhoneNumber {

  @NotEmpty(message = "予約者電話番号は必須")
  @Length(min = 11, max = 11, message = "予約者電話番号は11桁のみ")
  @Pattern(regexp = "^\\d+", message = "予約者電話番号は数値のみ")
  @JsonValue
  String value;

  PhoneNumber(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }

  PhoneNumber() {}
}
