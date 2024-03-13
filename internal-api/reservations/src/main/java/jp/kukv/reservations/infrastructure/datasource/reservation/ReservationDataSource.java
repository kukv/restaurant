package jp.kukv.reservations.infrastructure.datasource.reservation;

import java.util.List;
import java.util.Objects;
import jp.kukv.reservations.application.service.reservation.ReservationRepository;
import jp.kukv.reservations.domain.model.receipt.ReceiptNumber;
import jp.kukv.reservations.domain.model.reservation.Reservation;
import jp.kukv.reservations.domain.model.reservation.Reservations;
import jp.kukv.reservations.domain.problem.ResourceNotFoundException;
import org.springframework.stereotype.Repository;

@Repository
class ReservationDataSource implements ReservationRepository {

  ReservationMapper reservationMapper;

  @Override
  public Reservation findBy(ReceiptNumber receiptNumber) {
    Reservation reservation = reservationMapper.findBy(receiptNumber);
    if (Objects.isNull(reservation)) {
      String message =
          String.format(
              "There is no corresponding reservation for receiptNumber [%s].", receiptNumber);
      throw new ResourceNotFoundException(message);
    }
    return reservation;
  }

  @Override
  public Reservations listAll() {
    List<Reservation> list = reservationMapper.listAll();
    return new Reservations(list);
  }

  ReservationDataSource(ReservationMapper reservationMapper) {
    this.reservationMapper = reservationMapper;
  }
}
