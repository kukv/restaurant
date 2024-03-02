package jp.kukv.reservations.infrastructure.datasource.reservation;

import jp.kukv.reservations.application.service.reservation.ReservationRecordRepository;
import jp.kukv.reservations.domain.model.reservation.Reservation;
import jp.kukv.reservations.domain.model.reservation.ReservationId;
import jp.kukv.reservations.infrastructure.datasource.CreatedTime;
import org.springframework.stereotype.Repository;

@Repository
class ReservationRecordDataSource implements ReservationRecordRepository {

  ReservationRecordMapper reservationRecordMapper;

  @Override
  public ReservationId reserve(Reservation reservation) {
    ReservationId reservationId = ReservationId.create();
    CreatedTime createdTime = CreatedTime.now();
    reservationRecordMapper.record(reservationId, reservation, createdTime);

    return reservationId;
  }

  ReservationRecordDataSource(ReservationRecordMapper reservationRecordMapper) {
    this.reservationRecordMapper = reservationRecordMapper;
  }
}
