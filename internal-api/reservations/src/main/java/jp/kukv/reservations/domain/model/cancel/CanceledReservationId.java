package jp.kukv.reservations.domain.model.cancel;

/** キャンセルID */
class CanceledReservationId {

  Integer value;

  CanceledReservationId(Integer value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}
