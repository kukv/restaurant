package jp.kukv.reservations.application.service.identify;

import jp.kukv.reservations.domain.model.identify.DinerId;
import jp.kukv.reservations.domain.model.reservation.ReservationId;
import org.springframework.stereotype.Service;

@Service
public class RestaurantApplicationLinkageRecordService {

  RestaurantApplicationLinkageRecordRepository restaurantApplicationLinkageRecordRepository;

  public void linkage(ReservationId reservationId, DinerId dinerId) {
    restaurantApplicationLinkageRecordRepository.linkage(reservationId, dinerId);
  }

  RestaurantApplicationLinkageRecordService(
      RestaurantApplicationLinkageRecordRepository restaurantApplicationLinkageRecordRepository) {
    this.restaurantApplicationLinkageRecordRepository =
        restaurantApplicationLinkageRecordRepository;
  }
}
