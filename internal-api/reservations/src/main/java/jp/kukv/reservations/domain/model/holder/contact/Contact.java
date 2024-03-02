package jp.kukv.reservations.domain.model.holder.contact;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/** 予約者連絡先 */
public class Contact {

  @NotNull(message = "予約者電話番号は必須")
  @Valid
  @JsonProperty
  PhoneNumber phoneNumber;

  Contact(PhoneNumber phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  @Override
  public String toString() {
    return "Contact{" + "phoneNumber=" + phoneNumber + '}';
  }

  Contact() {}
}
