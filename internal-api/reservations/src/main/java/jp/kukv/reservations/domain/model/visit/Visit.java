package jp.kukv.reservations.domain.model.visit;

/** 来店予定 */
public class Visit {

  VisitDate visitDate;
  VisitTime visitTime;
  NumberOfVisitors numberOfVisitors;

  Visit(VisitDate visitDate, VisitTime visitTime, NumberOfVisitors numberOfVisitors) {
    this.visitDate = visitDate;
    this.visitTime = visitTime;
    this.numberOfVisitors = numberOfVisitors;
  }

  public VisitDate visitDate() {
    return visitDate;
  }

  public VisitTime visitTime() {
    return visitTime;
  }

  @Override
  public String toString() {
    return "Visit{"
        + "visitDate="
        + visitDate
        + ", visitTime="
        + visitTime
        + ", numberOfVisitors="
        + numberOfVisitors
        + '}';
  }

  Visit() {}
}
