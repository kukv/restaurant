package jp.kukv.reservations.application.service.holder.profile;

import jp.kukv.reservations.domain.model.holder.profile.Profile;
import jp.kukv.reservations.domain.model.reservation.ReservationId;

public interface ProfileRecordRepository {
  void record(ReservationId reservationId, Profile profile);
}
