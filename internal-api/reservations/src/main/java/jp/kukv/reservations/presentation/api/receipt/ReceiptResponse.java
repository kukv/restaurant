package jp.kukv.reservations.presentation.api.receipt;

import com.fasterxml.jackson.annotation.JsonProperty;
import jp.kukv.reservations.domain.model.receipt.ReceiptNumber;

class ReceiptResponse {

  @JsonProperty ReceiptNumber receiptNumber;

  ReceiptResponse(ReceiptNumber receiptNumber) {
    this.receiptNumber = receiptNumber;
  }

  @Override
  public String toString() {
    return "ReceiptResponse{" + "receiptNumber=" + receiptNumber + '}';
  }

  ReceiptResponse() {}
}
