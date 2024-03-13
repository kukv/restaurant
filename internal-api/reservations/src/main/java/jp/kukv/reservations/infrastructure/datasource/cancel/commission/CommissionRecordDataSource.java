package jp.kukv.reservations.infrastructure.datasource.cancel.commission;

import jp.kukv.reservations.application.service.cancel.commission.CommissionRecordRepository;
import jp.kukv.reservations.domain.model.cancel.commission.CancelAmount;
import jp.kukv.reservations.domain.model.receipt.ReceiptNumber;
import org.springframework.stereotype.Repository;

@Repository
class CommissionRecordDataSource implements CommissionRecordRepository {
  @Override
  public void charge(ReceiptNumber receiptNumber, CancelAmount cancelAmount) {}

  @Override
  public void collect(ReceiptNumber receiptNumber) {}
}
