package jp.kukv.reservations.infrastructure.datasource.receipt;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mockStatic;

import java.time.LocalDateTime;
import jp.kukv.reservations.domain.model.receipt.ReceiptNumber;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;

class 予約受付番号生成テスト {

  @BeforeAll
  static void setup() {
    LocalDateTime datetime = LocalDateTime.parse("2024-03-12T11:10:50.876");
    MockedStatic<LocalDateTime> mock = mockStatic(LocalDateTime.class);
    mock.when(LocalDateTime::now).thenReturn(datetime);
  }

  @Test
  void 予約受付番号生成テスト() {
    ReceiptSerialNumber receiptSerialNumber = new ReceiptSerialNumber(123456789L);
    ReceiptNumber receiptNumber = receiptSerialNumber.toReceiptNumber();

    assertEquals("20240312111050876000000000000000000000000123456789", receiptNumber.toString());
  }
}
