package jp.kukv.reservations.domain.model.visit;

import java.time.LocalDate;
import java.time.LocalTime;

public class VisitDummyFactory {

  public static Visit create(LocalDate date, LocalTime time, Integer numberOfVisitors) {
    VisitDate visitDate = new VisitDate(date);
    VisitTime visitTime = new VisitTime(time);
    NumberOfVisitors numberOfVisitors1 = new NumberOfVisitors(numberOfVisitors);
    return new Visit(visitDate, visitTime, numberOfVisitors1);
  }
}
