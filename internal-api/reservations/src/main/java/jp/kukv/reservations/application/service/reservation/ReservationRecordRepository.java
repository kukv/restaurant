package jp.kukv.reservations.application.service.reservation;

import jp.kukv.reservations.domain.model.reservation.Reservation;
import jp.kukv.reservations.domain.model.reservation.ReservationId;

public interface ReservationRecordRepository {
  ReservationId reserve(Reservation reservation);
}
