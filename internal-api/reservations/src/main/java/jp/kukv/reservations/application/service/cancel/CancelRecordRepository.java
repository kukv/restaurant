package jp.kukv.reservations.application.service.cancel;

import jp.kukv.reservations.domain.model.cancel.Reason;
import jp.kukv.reservations.domain.model.receipt.ReceiptNumber;

/** 予約キャンセル記録サービス */
public interface CancelRecordRepository {
  void cancel(ReceiptNumber receiptNumber, Reason reason);
}
