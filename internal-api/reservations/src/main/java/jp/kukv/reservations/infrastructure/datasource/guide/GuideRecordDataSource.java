package jp.kukv.reservations.infrastructure.datasource.guide;

import jp.kukv.reservations.application.service.guide.GuideRecordRepository;
import jp.kukv.reservations.domain.model.receipt.ReceiptNumber;
import org.springframework.stereotype.Repository;

@Repository
class GuideRecordDataSource implements GuideRecordRepository {
  @Override
  public void guide(ReceiptNumber receiptNumber) {}
}
