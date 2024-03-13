package jp.kukv.reservations.domain.model.receipt;

import jp.kukv.reservations.domain.model.course.Course;
import jp.kukv.reservations.domain.model.holder.Holder;
import jp.kukv.reservations.domain.model.visit.Visit;

/** 予約受付 */
public class Receipt {

  ReceiptNumber receiptNumber;
  Visit visit;
  Holder holder;
  Course course;

  Receipt(ReceiptNumber receiptNumber, Visit visit, Holder holder, Course course) {
    this.receiptNumber = receiptNumber;
    this.visit = visit;
    this.holder = holder;
    this.course = course;
  }

  @Override
  public String toString() {
    return "Receipt{"
        + "receiptNumber="
        + receiptNumber
        + ", visit="
        + visit
        + ", holder="
        + holder
        + ", course="
        + course
        + '}';
  }

  Receipt() {}
}
