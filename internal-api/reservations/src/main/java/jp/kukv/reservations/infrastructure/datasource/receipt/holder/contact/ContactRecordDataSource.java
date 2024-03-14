package jp.kukv.reservations.infrastructure.datasource.receipt.holder.contact;

import jp.kukv.reservations.application.service.receipt.holder.contact.ContactRecordRepository;
import jp.kukv.reservations.domain.model.receipt.ReceiptNumber;
import jp.kukv.reservations.domain.model.receipt.holder.contact.Contact;
import jp.kukv.reservations.infrastructure.datasource.CreatedTime;
import org.springframework.stereotype.Repository;

@Repository
class ContactRecordDataSource implements ContactRecordRepository {

  ContactRecordMapper contactRecordMapper;

  @Override
  public void record(ReceiptNumber receiptNumber, Contact contact) {
    CreatedTime createdTime = CreatedTime.now();
    contactRecordMapper.record(receiptNumber, contact, createdTime);
  }

  ContactRecordDataSource(ContactRecordMapper contactRecordMapper) {
    this.contactRecordMapper = contactRecordMapper;
  }
}
