package jp.kukv.reservations.domain.model.cancel;

/** キャンセル理由 */
class Reason {

  String value;

  Reason(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }
}
