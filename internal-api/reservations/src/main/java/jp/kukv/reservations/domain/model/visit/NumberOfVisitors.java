package jp.kukv.reservations.domain.model.visit;

/** 来店人数 */
class NumberOfVisitors {

  Integer value;

  NumberOfVisitors(Integer value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  NumberOfVisitors() {}
}
