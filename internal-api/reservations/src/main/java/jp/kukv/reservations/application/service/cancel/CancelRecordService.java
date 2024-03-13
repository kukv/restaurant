package jp.kukv.reservations.application.service.cancel;

import jp.kukv.reservations.domain.model.cancel.Reason;
import jp.kukv.reservations.domain.model.receipt.ReceiptNumber;
import org.springframework.stereotype.Service;

/** 予約キャンセル記録サービス */
@Service
public class CancelRecordService {

  CancelRecordRepository cancelRecordRepository;

  /** キャンセルする */
  public void cancel(ReceiptNumber receiptNumber, Reason reason) {
    cancelRecordRepository.cancel(receiptNumber, reason);
  }

  CancelRecordService(CancelRecordRepository cancelRecordRepository) {
    this.cancelRecordRepository = cancelRecordRepository;
  }
}
