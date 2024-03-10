package jp.kukv.reservations.domain.model.holder.contact;

/** メールアドレス */
class MailAddress {

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
