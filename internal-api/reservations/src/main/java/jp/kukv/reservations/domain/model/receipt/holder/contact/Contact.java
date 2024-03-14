package jp.kukv.reservations.domain.model.receipt.holder.contact;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/** 予約者連絡先 */
public class Contact {

  @NotNull(message = "電話番号は必須")
  @Valid
  @JsonProperty
  PhoneNumber phoneNumber;

  @NotNull(message = "メールアドレスは必須")
  @Valid
  @JsonProperty
  MailAddress mailAddress;

  Contact(PhoneNumber phoneNumber, MailAddress mailAddress) {
    this.phoneNumber = phoneNumber;
    this.mailAddress = mailAddress;
  }

  @Override
  public String toString() {
    return "Contact{" + "phoneNumber=" + phoneNumber + ", mailAddress=" + mailAddress + '}';
  }

  Contact() {}
}
