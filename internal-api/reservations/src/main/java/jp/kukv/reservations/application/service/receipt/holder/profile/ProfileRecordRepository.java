package jp.kukv.reservations.application.service.receipt.holder.profile;

import jp.kukv.reservations.domain.model.receipt.ReceiptNumber;
import jp.kukv.reservations.domain.model.receipt.holder.profile.Profile;

public interface ProfileRecordRepository {
  void record(ReceiptNumber receiptNumber, Profile profile);
}
