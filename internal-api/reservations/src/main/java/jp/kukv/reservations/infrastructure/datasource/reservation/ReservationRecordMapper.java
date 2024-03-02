package jp.kukv.reservations.infrastructure.datasource.reservation;

import jp.kukv.reservations.domain.model.reservation.Reservation;
import jp.kukv.reservations.domain.model.reservation.ReservationId;
import jp.kukv.reservations.infrastructure.datasource.CreatedTime;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
interface ReservationRecordMapper {
  void record(
      @Param("reservationId") ReservationId reservationId,
      @Param("reservation") Reservation reservation,
      @Param("createdTime") CreatedTime createdTime);
}
