package jp.kukv.reservations.application.service.receipt.holder.contact;

import jp.kukv.reservations.domain.model.receipt.ReceiptNumber;
import jp.kukv.reservations.domain.model.receipt.holder.contact.Contact;

public interface ContactRecordRepository {
  void record(ReceiptNumber receiptNumber, Contact contact);
}
