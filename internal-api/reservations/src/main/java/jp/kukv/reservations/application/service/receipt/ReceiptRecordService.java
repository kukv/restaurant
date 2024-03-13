package jp.kukv.reservations.application.service.receipt;

import jp.kukv.reservations.domain.model.receipt.ReceiptNumber;
import org.springframework.stereotype.Service;

/** 予約受付サービス */
@Service
public class ReceiptRecordService {

  ReceiptRecordRepository receiptRecordRepository;

  /** 予約を受け付ける */
  public ReceiptNumber receipt() {
    return receiptRecordRepository.receipt();
  }

  ReceiptRecordService(ReceiptRecordRepository receiptRecordRepository) {
    this.receiptRecordRepository = receiptRecordRepository;
  }
}
