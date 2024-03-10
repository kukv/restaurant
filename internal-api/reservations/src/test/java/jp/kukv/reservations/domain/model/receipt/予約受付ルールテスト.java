package jp.kukv.reservations.domain.model.receipt;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.LocalTime;
import jp.kukv.reservations.domain.model.visit.Visit;
import jp.kukv.reservations.domain.model.visit.VisitDummyFactory;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

public class 予約受付ルールテスト {

  @BeforeAll
  static void setup() {
    LocalDate 実際の来店日 = LocalDate.parse("2024-03-09");
    MockedStatic<LocalDate> mockDate =
        Mockito.mockStatic(LocalDate.class, Mockito.CALLS_REAL_METHODS);
    mockDate.when(LocalDate::now).thenReturn(実際の来店日);

    LocalTime 実際の来店時刻 = LocalTime.parse("10:00:00");
    MockedStatic<LocalTime> mockTime =
        Mockito.mockStatic(LocalTime.class, Mockito.CALLS_REAL_METHODS);
    mockTime.when(LocalTime::now).thenReturn(実際の来店時刻);
  }

  @Test
  void 来店予定日が実際の来店日の翌日以降の場合エラーにならない() {
    LocalDate 来店予定日が実際の来店日の翌日以降の日付 = LocalDate.parse("2024-03-10");
    LocalTime time = LocalTime.parse("12:00:00");
    Visit visit = VisitDummyFactory.create(来店予定日が実際の来店日の翌日以降の日付, time, 1);

    ReceiptRule rule = new ReceiptRule(visit);
    assertDoesNotThrow(rule::check);
  }

  @Test
  void 来店予定日が実際の来店日と同じかつ来店予定時刻が実際の来店時刻の30分以上前の場合エラーにならない() {
    LocalDate 来店予定日が実際の来店日と同じの日付 = LocalDate.parse("2024-03-09");
    LocalTime 来店予定時刻が実際の来店時刻の30分以上前の時刻 = LocalTime.parse("09:30:00");
    Visit visit = VisitDummyFactory.create(来店予定日が実際の来店日と同じの日付, 来店予定時刻が実際の来店時刻の30分以上前の時刻, 1);

    ReceiptRule rule = new ReceiptRule(visit);
    assertDoesNotThrow(rule::check);
  }

  @Test
  void 来店予定日が実際の来店日の前日以前の場合エラーになる() {
    LocalDate 来店予定日が実際の来店日の翌日以降の日付 = LocalDate.parse("2024-03-08");
    LocalTime time = LocalTime.parse("12:00:00");
    Visit visit = VisitDummyFactory.create(来店予定日が実際の来店日の翌日以降の日付, time, 1);

    ReceiptRule rule = new ReceiptRule(visit);
    assertThrows(IllegalArgumentException.class, rule::check);
  }

  @Test
  void 来店予定日が実際の来店日と同じかつ来店予定日が実際の来店日の前日以前の場合エラーになる() {
    LocalDate 来店予定日が実際の来店日と同じの日付 = LocalDate.parse("2024-03-09");
    LocalTime 来店予定時刻が実際の来店時刻の30分以内の時刻 = LocalTime.parse("09:31:00");
    Visit visit = VisitDummyFactory.create(来店予定日が実際の来店日と同じの日付, 来店予定時刻が実際の来店時刻の30分以内の時刻, 1);

    ReceiptRule rule = new ReceiptRule(visit);
    assertThrows(IllegalArgumentException.class, rule::check);
  }
}
