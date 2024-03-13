package jp.kukv.reservations.application.service.holder.contact;

import jp.kukv.reservations.domain.model.holder.contact.Contact;
import jp.kukv.reservations.domain.model.receipt.ReceiptNumber;

public interface ContactRecordRepository {
  void record(ReceiptNumber receiptNumber, Contact contact);
}
