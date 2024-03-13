package jp.kukv.reservations.domain.model.visit;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/** 来店予定 */
public class Visit {

  @NotNull(message = "来店予定日は必須")
  @Valid
  @JsonProperty
  VisitDate visitDate;

  @NotNull(message = "来店予定時刻は必須")
  @Valid
  @JsonProperty
  VisitTime visitTime;

  @NotNull(message = "来店人数は必須")
  @Valid
  @JsonProperty
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
