package jp.kukv.reservations.application.service.reservation;

import jp.kukv.reservations.domain.model.receipt.ReceiptNumber;
import jp.kukv.reservations.domain.model.reservation.Reservation;
import jp.kukv.reservations.domain.model.reservation.Reservations;
import org.apache.ibatis.annotations.Param;

public interface ReservationRepository {
  Reservation findBy(@Param("receiptNumber") ReceiptNumber receiptNumber);

  Reservations listAll();
}
