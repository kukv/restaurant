package jp.kukv.reservations.infrastructure.datasource.holder.profile;

import jp.kukv.reservations.domain.model.holder.profile.Profile;
import jp.kukv.reservations.domain.model.reservation.ReservationId;
import jp.kukv.reservations.infrastructure.datasource.CreatedTime;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
interface ProfileRecordMapper {
  void record(
      @Param("reservationId") ReservationId reservationId,
      @Param("profile") Profile profile,
      @Param("createdTime") CreatedTime createdTime);
}
