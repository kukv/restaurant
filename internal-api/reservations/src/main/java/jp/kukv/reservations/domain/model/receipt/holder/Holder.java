package jp.kukv.reservations.domain.model.receipt.holder;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jp.kukv.reservations.domain.model.receipt.holder.contact.Contact;
import jp.kukv.reservations.domain.model.receipt.holder.profile.Profile;

/** 予約者 */
public class Holder {

  @NotNull(message = "予約者連絡先は必須")
  @Valid
  @JsonProperty
  Contact contact;

  @NotNull(message = "予約者プロフィールは必須")
  @Valid
  @JsonProperty
  Profile profile;

  Holder(Contact contact, Profile profile) {
    this.contact = contact;
    this.profile = profile;
  }

  public Contact contact() {
    return contact;
  }

  public Profile profile() {
    return profile;
  }

  @Override
  public String toString() {
    return "Holder{" + "contact=" + contact + ", profile=" + profile + '}';
  }

  Holder() {}
}
