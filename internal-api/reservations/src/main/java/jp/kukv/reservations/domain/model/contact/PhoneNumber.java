package jp.kukv.reservations.domain.model.contact;

/** 予約者電話番号 */
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
