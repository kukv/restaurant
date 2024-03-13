package jp.kukv.reservations.application.service.cancel.commission;

import jp.kukv.reservations.domain.model.cancel.commission.CancelAmount;
import jp.kukv.reservations.domain.model.receipt.ReceiptNumber;
import org.springframework.stereotype.Service;

/** 予約キャンセル手数料記録サービス */
@Service
public class CommissionRecordService {

  CommissionRecordRepository commissionRecordRepository;

  /** 請求する */
  public void charge(ReceiptNumber receiptNumber, CancelAmount cancelAmount) {
    commissionRecordRepository.charge(receiptNumber, cancelAmount);
  }

  /** 徴収する */
  public void collect(ReceiptNumber receiptNumber) {
    commissionRecordRepository.collect(receiptNumber);
  }

  CommissionRecordService(CommissionRecordRepository commissionRecordRepository) {
    this.commissionRecordRepository = commissionRecordRepository;
  }
}
