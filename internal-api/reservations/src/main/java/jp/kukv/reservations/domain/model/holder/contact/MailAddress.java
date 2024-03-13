package jp.kukv.reservations.domain.model.holder.contact;

import jakarta.validation.constraints.NotEmpty;
import jp.kukv.reservations.domain.validator.email.Email;
import org.hibernate.validator.constraints.Length;

/** メールアドレス */
class MailAddress {

  @NotEmpty(message = "メールアドレス")
  @Length(max = 128, message = "メールアドレスの長さは128文字以下")
  @Email(message = "メールアドレスの形式が不正")
  String value;

  MailAddress(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }

  MailAddress() {}
}
