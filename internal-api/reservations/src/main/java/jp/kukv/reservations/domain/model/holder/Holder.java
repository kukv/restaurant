package jp.kukv.reservations.domain.model.holder;

import jp.kukv.reservations.domain.model.holder.contact.Contact;
import jp.kukv.reservations.domain.model.holder.profile.Profile;

/** 予約者 */
public class Holder {

  Contact contact;
  Profile profile;

  Holder(Contact contact, Profile profile) {
    this.contact = contact;
    this.profile = profile;
  }

  @Override
  public String toString() {
    return "Holder{" + "contact=" + contact + ", profile=" + profile + '}';
  }

  Holder() {}
}
