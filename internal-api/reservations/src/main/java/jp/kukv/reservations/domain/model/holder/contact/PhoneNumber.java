package jp.kukv.reservations.domain.model.holder.contact;

/** 電話番号 */
class PhoneNumber {

  String value;

  PhoneNumber(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }

  PhoneNumber() {}
}
