package jp.kukv.reservations.infrastructure.datasource.diners;

import jp.kukv.reservations.application.service.diners.DinnersLinkageRecordRepository;
import jp.kukv.reservations.domain.model.diners.DinersId;
import jp.kukv.reservations.domain.model.receipt.ReceiptNumber;
import org.springframework.stereotype.Repository;

@Repository
class DinnersLinkageRecordDataSource implements DinnersLinkageRecordRepository {
  @Override
  public void linkage(ReceiptNumber receiptNumber, DinersId dinersId) {}
}
