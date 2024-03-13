package jp.kukv.reservations.domain.model.diners;

/** レストラン会員と予約連携 */
public class DinersLinkage {

  Linkage linkage;
  DinersId dinersId;

  DinersLinkage(Linkage linkage, DinersId dinersId) {
    this.linkage = linkage;
    this.dinersId = dinersId;
  }

  @Override
  public String toString() {
    return "DinersLinkage{" + "linkage=" + linkage + ", dinersId=" + dinersId + '}';
  }

  DinersLinkage() {}
}
