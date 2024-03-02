package jp.kukv.reservations.infrastructure.datasource.holder.profile;

import jp.kukv.reservations.application.service.holder.profile.ProfileRecordRepository;
import jp.kukv.reservations.domain.model.holder.profile.Profile;
import jp.kukv.reservations.domain.model.reservation.ReservationId;
import jp.kukv.reservations.infrastructure.datasource.reservation.course.CreatedTime;
import org.springframework.stereotype.Repository;

@Repository
class ProfileRecordDataSource implements ProfileRecordRepository {

  ProfileRecordMapper profileRecordMapper;

  @Override
  public void record(ReservationId reservationId, Profile profile) {
    CreatedTime createdTime = CreatedTime.now();
    profileRecordMapper.record(reservationId, profile, createdTime);
  }

  ProfileRecordDataSource(ProfileRecordMapper profileRecordMapper) {
    this.profileRecordMapper = profileRecordMapper;
  }
}
