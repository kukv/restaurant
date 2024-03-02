package jp.kukv.reservations.domain.model.reservation;

/** 予約受付ルール */
public class ReservationRule {

  Reservation reservation;

  public ReservationRule(Reservation reservation) {
    this.reservation = reservation;
  }

  public void check() {
    if (!reservation.is当日30分以上前の予約()) {
      throw new IllegalArgumentException("予約日時は当日30分以上前である必要がある");
    }
  }

  @Override
  public String toString() {
    return "ReservationRule{" + "reservation=" + reservation + '}';
  }

  ReservationRule() {}
}
