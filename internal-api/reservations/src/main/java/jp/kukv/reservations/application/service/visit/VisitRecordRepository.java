package jp.kukv.reservations.application.service.visit;

import jp.kukv.reservations.domain.model.receipt.ReceiptNumber;
import jp.kukv.reservations.domain.model.visit.Visit;

public interface VisitRecordRepository {
  void record(ReceiptNumber receiptNumber, Visit visit);
}
