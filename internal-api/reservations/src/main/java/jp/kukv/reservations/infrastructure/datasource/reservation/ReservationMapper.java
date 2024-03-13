package jp.kukv.reservations.infrastructure.datasource.reservation;

import java.util.List;
import jp.kukv.reservations.domain.model.receipt.ReceiptNumber;
import jp.kukv.reservations.domain.model.reservation.Reservation;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
interface ReservationMapper {

  Reservation findBy(@Param("receiptNumber") ReceiptNumber receiptNumber);

  List<Reservation> listAll();
}
