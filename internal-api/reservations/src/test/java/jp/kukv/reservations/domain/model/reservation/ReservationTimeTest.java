package jp.kukv.reservations.domain.model.reservation;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalTime;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("予約時刻テスト")
class ReservationTimeTest {

  @DisplayName("予約時刻が30分以上前の場合trueを返す")
  @Test
  void 予約時刻が30分以上前() {
    LocalTime now = LocalTime.now();
    ReservationTime reservationTime = new ReservationTime(now.minusMinutes(30));

    assertTrue(reservationTime.is予約時刻が30分以上前());
  }

  @DisplayName("予約時刻が30分より前の場合falseを返す")
  @Test
  void 予約時刻が30分より前() {
    LocalTime now = LocalTime.now();
    ReservationTime reservationTime = new ReservationTime(now.minusMinutes(29));

    assertFalse(reservationTime.is予約時刻が30分以上前());
  }
}
