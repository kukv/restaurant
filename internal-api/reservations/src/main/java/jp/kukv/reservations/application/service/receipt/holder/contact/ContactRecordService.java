package jp.kukv.reservations.application.service.receipt.holder.contact;

import jp.kukv.reservations.domain.model.receipt.ReceiptNumber;
import jp.kukv.reservations.domain.model.receipt.holder.contact.Contact;
import org.springframework.stereotype.Service;

/** 予約者連絡先記録サービス */
@Service
public class ContactRecordService {

  ContactRecordRepository contactRecordRepository;

  /** 記録する */
  public void record(ReceiptNumber receiptNumber, Contact contact) {
    contactRecordRepository.record(receiptNumber, contact);
  }

  ContactRecordService(ContactRecordRepository contactRecordRepository) {
    this.contactRecordRepository = contactRecordRepository;
  }
}
