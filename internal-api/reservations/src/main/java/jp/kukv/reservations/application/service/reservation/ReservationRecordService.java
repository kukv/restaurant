package jp.kukv.reservations.application.service.reservation;

import jp.kukv.reservations.domain.model.reservation.Reservation;
import jp.kukv.reservations.domain.model.reservation.ReservationId;
import org.springframework.stereotype.Service;

/** 予約サービス */
@Service
public class ReservationRecordService {

  /** 予約する */
  public ReservationId reserve(Reservation reservation) {
    return ReservationId.create();
  }
}
