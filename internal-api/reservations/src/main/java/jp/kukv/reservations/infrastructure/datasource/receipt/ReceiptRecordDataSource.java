package jp.kukv.reservations.infrastructure.datasource.receipt;

import jp.kukv.reservations.application.service.receipt.ReceiptRecordRepository;
import jp.kukv.reservations.domain.model.receipt.ReceiptNumber;
import jp.kukv.reservations.infrastructure.datasource.CreatedTime;
import org.springframework.stereotype.Repository;

@Repository
class ReceiptRecordDataSource implements ReceiptRecordRepository {

  ReceiptRecordMapper receiptRecordMapper;

  @Override
  public ReceiptNumber receipt() {
    ReceiptSerialNumber receiptSerialNumber = receiptRecordMapper.create();
    ReceiptNumber receiptNumber = receiptSerialNumber.toReceiptNumber();

    CreatedTime createdTime = CreatedTime.now();
    receiptRecordMapper.record(receiptNumber, createdTime);

    return receiptNumber;
  }

  ReceiptRecordDataSource(ReceiptRecordMapper receiptRecordMapper) {
    this.receiptRecordMapper = receiptRecordMapper;
  }
}
