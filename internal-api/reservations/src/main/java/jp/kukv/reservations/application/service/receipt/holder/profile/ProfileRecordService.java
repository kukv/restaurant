package jp.kukv.reservations.application.service.receipt.holder.profile;

import jp.kukv.reservations.domain.model.receipt.ReceiptNumber;
import jp.kukv.reservations.domain.model.receipt.holder.profile.Profile;
import org.springframework.stereotype.Service;

/** 予約者プロフィール記録サービス */
@Service
public class ProfileRecordService {

  ProfileRecordRepository profileRecordRepository;

  /** 記録する */
  public void record(ReceiptNumber receiptNumber, Profile profile) {
    profileRecordRepository.record(receiptNumber, profile);
  }

  ProfileRecordService(ProfileRecordRepository profileRecordRepository) {
    this.profileRecordRepository = profileRecordRepository;
  }
}
