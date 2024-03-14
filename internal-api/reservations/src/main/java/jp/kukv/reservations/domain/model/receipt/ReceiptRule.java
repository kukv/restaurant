package jp.kukv.reservations.domain.model.receipt;

import jp.kukv.reservations.domain.model.receipt.visit.Visit;
import jp.kukv.reservations.domain.model.receipt.visit.VisitDate;
import jp.kukv.reservations.domain.model.receipt.visit.VisitTime;

/** 予約受付ルール */
class ReceiptRule {

  Visit visit;

  ReceiptRule(Visit visit) {
    this.visit = visit;
  }

  void check() {
    VisitDate visitDate = visit.visitDate();
    if (visitDate.is過去日付()) {
      throw new IllegalArgumentException("来店予定日は当日以降である必要がある");
    }
    if (visitDate.is未来日付()) return;

    VisitTime visitTime = visit.visitTime();
    if (!visitTime.is来店予定時刻が現在時刻の30分以上前()) {
      throw new IllegalArgumentException("予約日時は当日30分以上前である必要がある");
    }
  }

  @Override
  public String toString() {
    return "ReservationRule{" + "visit=" + visit + '}';
  }

  ReceiptRule() {}
}
