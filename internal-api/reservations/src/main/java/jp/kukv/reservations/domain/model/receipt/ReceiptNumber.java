package jp.kukv.reservations.domain.model.receipt;

import com.fasterxml.jackson.annotation.JsonValue;

/** 予約受付番号 */
public class ReceiptNumber {

  @JsonValue String value;

  public ReceiptNumber(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }

  ReceiptNumber() {}
}
