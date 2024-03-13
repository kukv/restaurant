package jp.kukv.reservations.domain.model.diners;

/** 食事人ID */
public class DinersId {

  Integer value;

  DinersId(Integer value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  DinersId() {}
}
