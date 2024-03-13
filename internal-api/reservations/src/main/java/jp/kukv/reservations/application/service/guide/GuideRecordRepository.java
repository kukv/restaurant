package jp.kukv.reservations.application.service.guide;

import jp.kukv.reservations.domain.model.receipt.ReceiptNumber;

public interface GuideRecordRepository {
  void guide(ReceiptNumber receiptNumber);
}
