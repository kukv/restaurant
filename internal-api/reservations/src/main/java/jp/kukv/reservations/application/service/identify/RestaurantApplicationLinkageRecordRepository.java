package jp.kukv.reservations.application.service.identify;

import jp.kukv.reservations.domain.model.identify.DinerId;
import jp.kukv.reservations.domain.model.reservation.ReservationId;

public interface RestaurantApplicationLinkageRecordRepository {
  void linkage(ReservationId reservationId, DinerId dinerId);
}
