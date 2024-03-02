package jp.kukv.reservations.domain.model.holder;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jp.kukv.reservations.domain.model.holder.contact.Contact;
import jp.kukv.reservations.domain.model.holder.profile.Profile;

/** 予約者 */
public class Holder {

  @NotNull(message = "予約者プロフィールは必須")
  @Valid
  @JsonProperty
  Profile profile;

  @NotNull(message = "予約者連絡先は必須")
  @Valid
  @JsonProperty
  Contact contact;

  Holder(Profile profile, Contact contact) {
    this.profile = profile;
    this.contact = contact;
  }

  public Profile profile() {
    return profile;
  }

  public Contact contact() {
    return contact;
  }

  @Override
  public String toString() {
    return "Holder{" + "profile=" + profile + ", contact=" + contact + '}';
  }

  Holder() {}
}
