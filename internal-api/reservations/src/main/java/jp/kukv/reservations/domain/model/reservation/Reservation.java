package jp.kukv.reservations.domain.model.reservation;

import jp.kukv.reservations.domain.model.course.Course;
import jp.kukv.reservations.domain.model.diners.DinersLinkage;
import jp.kukv.reservations.domain.model.receipt.Receipt;

/** 予約 */
public class Reservation {

  Receipt receipt;
  Course course;
  DinersLinkage dinersLinkage;

  Reservation(Receipt receipt, Course course, DinersLinkage dinersLinkage) {
    this.receipt = receipt;
    this.course = course;
    this.dinersLinkage = dinersLinkage;
  }

  @Override
  public String toString() {
    return "Reservation{"
        + "receipt="
        + receipt
        + ", course="
        + course
        + ", dinersLinkage="
        + dinersLinkage
        + '}';
  }

  Reservation() {}
}
