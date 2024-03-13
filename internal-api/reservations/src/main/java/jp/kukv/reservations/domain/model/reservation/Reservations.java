package jp.kukv.reservations.domain.model.reservation;

import java.util.List;

/** 予約一覧 */
public class Reservations {

  List<Reservation> list;

  public Reservations(List<Reservation> list) {
    this.list = list;
  }

  @Override
  public String toString() {
    return "Reservations{" + "list=" + list + '}';
  }

  Reservations() {}
}
