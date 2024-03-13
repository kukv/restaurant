package jp.kukv.reservations.infrastructure.datasource.cancel;

import jp.kukv.reservations.application.service.cancel.CancelRecordRepository;
import jp.kukv.reservations.domain.model.cancel.Reason;
import jp.kukv.reservations.domain.model.receipt.ReceiptNumber;
import org.springframework.stereotype.Repository;

@Repository
class CancelRecordDataSource implements CancelRecordRepository {
  @Override
  public void cancel(ReceiptNumber receiptNumber, Reason reason) {}
}
