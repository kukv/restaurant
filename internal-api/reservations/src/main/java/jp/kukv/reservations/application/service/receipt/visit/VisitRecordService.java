package jp.kukv.reservations.application.service.receipt.visit;

import jp.kukv.reservations.domain.model.receipt.ReceiptNumber;
import jp.kukv.reservations.domain.model.receipt.visit.Visit;
import org.springframework.stereotype.Service;

/** 来店予定記録サービス */
@Service
public class VisitRecordService {
  VisitRecordRepository visitRecordRepository;

  /** 記録する */
  public void record(ReceiptNumber receiptNumber, Visit visit) {
    visitRecordRepository.record(receiptNumber, visit);
  }

  VisitRecordService(VisitRecordRepository visitRecordRepository) {
    this.visitRecordRepository = visitRecordRepository;
  }
}
