package jp.kukv.reservations.domain.model.holder.contact;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import org.hibernate.validator.constraints.Length;

/** 電話番号 */
class PhoneNumber {

  @NotEmpty(message = "電話番号は必須")
  @Length(min = 11, max = 11, message = "電話番号は11桁のみ")
  @Pattern(regexp = "^\\d+$", message = "電話番号の形式が不正")
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
