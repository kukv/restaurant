package jp.kukv.reservations.domain.model.receipt.course;

/** 予約コース種別 */
public enum CourseType {
  席のみ予約,
  コース料理予約;

  boolean is席のみ予約() {
    return this == 席のみ予約;
  }
}
