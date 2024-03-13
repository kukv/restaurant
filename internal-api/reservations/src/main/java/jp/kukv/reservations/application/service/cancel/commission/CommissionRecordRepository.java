package jp.kukv.reservations.application.service.cancel.commission;

import jp.kukv.reservations.domain.model.cancel.commission.CancelAmount;
import jp.kukv.reservations.domain.model.receipt.ReceiptNumber;

public interface CommissionRecordRepository {
  void charge(ReceiptNumber receiptNumber, CancelAmount cancelAmount);

  void collect(ReceiptNumber receiptNumber);
}
