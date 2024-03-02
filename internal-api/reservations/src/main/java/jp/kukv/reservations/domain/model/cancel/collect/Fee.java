package jp.kukv.reservations.domain.model.cancel.collect;

/** 　キャンセル料(円) */
class Fee {

  Integer value;

  Fee(Integer value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}
