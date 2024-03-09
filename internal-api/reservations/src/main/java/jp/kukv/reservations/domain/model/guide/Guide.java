package jp.kukv.reservations.domain.model.guide;

/** 予約案内 */
class Guide {

  GuidedTime guidedTime;

  Guide(GuidedTime guidedTime) {
    this.guidedTime = guidedTime;
  }

  @Override
  public String toString() {
    return "Guide{" + "guidedTime=" + guidedTime + '}';
  }

  Guide() {}
}
