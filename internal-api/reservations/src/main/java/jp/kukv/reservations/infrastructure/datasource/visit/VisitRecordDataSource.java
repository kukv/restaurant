package jp.kukv.reservations.infrastructure.datasource.visit;

import jp.kukv.reservations.application.service.visit.VisitRecordRepository;
import jp.kukv.reservations.domain.model.receipt.ReceiptNumber;
import jp.kukv.reservations.domain.model.visit.Visit;
import jp.kukv.reservations.infrastructure.datasource.CreatedTime;
import org.springframework.stereotype.Repository;

@Repository
class VisitRecordDataSource implements VisitRecordRepository {

  VisitRecordMapper visitRecordMapper;

  @Override
  public void record(ReceiptNumber receiptNumber, Visit visit) {
    CreatedTime createdTime = CreatedTime.now();
    visitRecordMapper.record(receiptNumber, visit, createdTime);
  }

  VisitRecordDataSource(VisitRecordMapper visitRecordMapper) {
    this.visitRecordMapper = visitRecordMapper;
  }
}
