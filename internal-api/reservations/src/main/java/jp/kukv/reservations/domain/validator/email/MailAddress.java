package jp.kukv.reservations.domain.validator.email;

import java.util.regex.Pattern;

/** メールアドレス */
class MailAddress {

  LocalPart local;
  DomainPart domain;

  MailAddress(String value) {
    Pattern delimiter = Pattern.compile("@");
    String[] parts = delimiter.split(value);
    if (parts.length != 2) return;
    this.local = new LocalPart(parts[0]);
    this.domain = new DomainPart(parts[1]);
  }

  boolean isValid() {
    if (!local.isValid()) return false;
    return domain.isValid();
  }

  @Override
  public String toString() {
    return "Email{" + "local=" + local + ", domain=" + domain + '}';
  }

  MailAddress() {}
}
