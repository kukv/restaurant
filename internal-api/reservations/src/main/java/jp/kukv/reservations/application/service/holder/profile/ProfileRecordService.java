package jp.kukv.reservations.application.service.holder.profile;

import jp.kukv.reservations.domain.model.holder.profile.Profile;
import jp.kukv.reservations.domain.model.reservation.ReservationId;
import org.springframework.stereotype.Service;

/** 予約者プロフィールサービス */
@Service
public class ProfileRecordService {

  ProfileRecordRepository profileRecordRepository;

  /** 記録する */
  public void record(ReservationId reservationId, Profile profile) {
    profileRecordRepository.record(reservationId, profile);
  }

  ProfileRecordService(ProfileRecordRepository profileRecordRepository) {
    this.profileRecordRepository = profileRecordRepository;
  }
}
