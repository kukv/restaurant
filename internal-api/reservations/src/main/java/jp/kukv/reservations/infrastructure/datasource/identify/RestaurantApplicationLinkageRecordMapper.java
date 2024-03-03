package jp.kukv.reservations.infrastructure.datasource.identify;

import jp.kukv.reservations.domain.model.identify.DinerId;
import jp.kukv.reservations.domain.model.reservation.ReservationId;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
interface RestaurantApplicationLinkageRecordMapper {
  void record(
      @Param("reservationId") ReservationId reservationId, @Param("dinerId") DinerId dinerId);
}
