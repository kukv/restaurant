package jp.kukv.reservations.application.service.diners;

import jp.kukv.reservations.domain.model.diners.DinersId;
import jp.kukv.reservations.domain.model.receipt.ReceiptNumber;

public interface DinnersLinkageRecordRepository {
  void linkage(ReceiptNumber receiptNumber, DinersId dinersId);
}
