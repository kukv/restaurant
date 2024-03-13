package jp.kukv.reservations.infrastructure.datasource.receipt;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import jp.kukv.reservations.domain.model.receipt.ReceiptNumber;

class ReceiptSerialNumber {

  Long value;

  ReceiptSerialNumber(Long value) {
    this.value = value;
  }

  ReceiptNumber toReceiptNumber() {
    LocalDateTime now = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSS");
    String datetimeStrings = formatter.format(now);

    String receiptNumber = String.format("%s%033d", datetimeStrings, value);
    return new ReceiptNumber(receiptNumber);
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  ReceiptSerialNumber() {}
}
