package jp.kukv.reservations.domain.model.holder.profile;

/** 予約者氏名 */
class Name {

  String value;

  Name(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }

  Name() {}
}
