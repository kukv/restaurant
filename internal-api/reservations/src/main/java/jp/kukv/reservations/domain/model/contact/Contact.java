package jp.kukv.reservations.domain.model.contact;

/** 予約者連絡先 */
class Contact {

  PhoneNumber phoneNumber;

  Contact(PhoneNumber phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  @Override
  public String toString() {
    return "Contact{" + "phoneNumber=" + phoneNumber + '}';
  }
}
