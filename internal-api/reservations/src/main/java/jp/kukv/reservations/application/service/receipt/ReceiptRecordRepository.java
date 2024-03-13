package jp.kukv.reservations.application.service.receipt;

import jp.kukv.reservations.domain.model.receipt.ReceiptNumber;

public interface ReceiptRecordRepository {
  ReceiptNumber receipt();
}
