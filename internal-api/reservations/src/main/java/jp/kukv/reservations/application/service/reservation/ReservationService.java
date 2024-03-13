package jp.kukv.reservations.application.service.reservation;

import jp.kukv.reservations.domain.model.receipt.ReceiptNumber;
import jp.kukv.reservations.domain.model.reservation.Reservation;
import jp.kukv.reservations.domain.model.reservation.Reservations;
import org.springframework.stereotype.Service;

/** 予約受付サービス */
@Service
public class ReservationService {

  ReservationRepository reservationRepository;

  public Reservation findBy(ReceiptNumber receiptNumber) {
    return reservationRepository.findBy(receiptNumber);
  }

  public Reservations listAll() {
    return reservationRepository.listAll();
  }

  ReservationService(ReservationRepository reservationRepository) {
    this.reservationRepository = reservationRepository;
  }
}
