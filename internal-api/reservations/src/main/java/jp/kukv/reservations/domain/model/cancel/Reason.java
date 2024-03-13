package jp.kukv.reservations.domain.model.cancel;

/** 予約キャンセル理由 */
public class Reason {

  String value;

  Reason(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }

  Reason() {}
}
