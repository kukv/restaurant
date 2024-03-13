package jp.kukv.reservations.application.service.guide;

import jp.kukv.reservations.domain.model.receipt.ReceiptNumber;
import org.springframework.stereotype.Service;

/** 予約案内記録サービス */
@Service
public class GuideRecordService {

  GuideRecordRepository guideRecordRepository;

  /** 案内する */
  public void guide(ReceiptNumber receiptNumber) {
    guideRecordRepository.guide(receiptNumber);
  }

  GuideRecordService(GuideRecordRepository guideRecordRepository) {
    this.guideRecordRepository = guideRecordRepository;
  }
}
