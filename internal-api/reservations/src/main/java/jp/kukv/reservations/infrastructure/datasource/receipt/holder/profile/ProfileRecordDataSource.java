package jp.kukv.reservations.infrastructure.datasource.receipt.holder.profile;

import jp.kukv.reservations.application.service.receipt.holder.profile.ProfileRecordRepository;
import jp.kukv.reservations.domain.model.receipt.ReceiptNumber;
import jp.kukv.reservations.domain.model.receipt.holder.profile.Profile;
import jp.kukv.reservations.infrastructure.datasource.CreatedTime;
import org.springframework.stereotype.Repository;

@Repository
class ProfileRecordDataSource implements ProfileRecordRepository {

  ProfileRecordMapper profileRecordMapper;

  @Override
  public void record(ReceiptNumber receiptNumber, Profile profile) {
    CreatedTime createdTime = CreatedTime.now();
    profileRecordMapper.record(receiptNumber, profile, createdTime);
  }

  ProfileRecordDataSource(ProfileRecordMapper profileRecordMapper) {
    this.profileRecordMapper = profileRecordMapper;
  }
}
