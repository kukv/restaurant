package jp.kukv.reservations.domain.model.reservation;

/** 予約 */
class Reservation {

  ReservationType type;
  ReservationDate date;
  ReservationTime time;

  Reservation(ReservationType type, ReservationDate date, ReservationTime time) {
    this.type = type;
    this.date = date;
    this.time = time;
  }

  @Override
  public String toString() {
    return "Reservation{" + "type=" + type + ", date=" + date + ", time=" + time + '}';
  }
}
