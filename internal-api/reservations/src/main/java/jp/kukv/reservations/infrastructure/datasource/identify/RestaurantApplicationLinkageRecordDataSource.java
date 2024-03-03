package jp.kukv.reservations.infrastructure.datasource.identify;

import jp.kukv.reservations.application.service.identify.RestaurantApplicationLinkageRecordRepository;
import jp.kukv.reservations.domain.model.identify.DinerId;
import jp.kukv.reservations.domain.model.reservation.ReservationId;
import org.springframework.stereotype.Repository;

@Repository
class RestaurantApplicationLinkageRecordDataSource
    implements RestaurantApplicationLinkageRecordRepository {

  RestaurantApplicationLinkageRecordMapper restaurantApplicationLinkageRecordMapper;

  @Override
  public void linkage(ReservationId reservationId, DinerId dinerId) {
    restaurantApplicationLinkageRecordMapper.record(reservationId, dinerId);
  }

  RestaurantApplicationLinkageRecordDataSource(
      RestaurantApplicationLinkageRecordMapper restaurantApplicationLinkageRecordMapper) {
    this.restaurantApplicationLinkageRecordMapper = restaurantApplicationLinkageRecordMapper;
  }
}
