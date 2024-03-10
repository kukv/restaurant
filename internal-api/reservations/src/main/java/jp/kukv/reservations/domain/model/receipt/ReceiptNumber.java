package jp.kukv.reservations.domain.model.receipt;

/** 予約受付番号 */
class ReceiptNumber {

  String value;

  ReceiptNumber(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }

  ReceiptNumber() {}
}
