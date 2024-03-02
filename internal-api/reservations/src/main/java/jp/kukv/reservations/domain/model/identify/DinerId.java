package jp.kukv.reservations.domain.model.identify;

/** ディナー客ID */
class DinerId {

  Integer value;

  DinerId(Integer value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}
