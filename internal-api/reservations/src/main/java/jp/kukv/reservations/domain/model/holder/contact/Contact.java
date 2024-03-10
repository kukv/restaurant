package jp.kukv.reservations.domain.model.holder.contact;

/** 予約者連絡先 */
public class Contact {

  PhoneNumber phoneNumber;
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
