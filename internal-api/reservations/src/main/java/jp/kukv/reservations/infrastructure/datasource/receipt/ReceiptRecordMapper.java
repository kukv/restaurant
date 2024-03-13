package jp.kukv.reservations.infrastructure.datasource.receipt;

import jp.kukv.reservations.domain.model.receipt.ReceiptNumber;
import jp.kukv.reservations.infrastructure.datasource.CreatedTime;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
interface ReceiptRecordMapper {

  ReceiptSerialNumber create();

  void record(
      @Param("receiptNumber") ReceiptNumber receiptNumber,
      @Param("createdTime") CreatedTime createdTime);
}
