package jp.kukv.reservations.application.service.holder.profile;

import jp.kukv.reservations.domain.model.holder.profile.Profile;
import jp.kukv.reservations.domain.model.receipt.ReceiptNumber;

public interface ProfileRecordRepository {
  void record(ReceiptNumber receiptNumber, Profile profile);
}
