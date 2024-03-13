package jp.kukv.reservations.infrastructure.datasource.visit;

import jp.kukv.reservations.domain.model.receipt.ReceiptNumber;
import jp.kukv.reservations.domain.model.visit.Visit;
import jp.kukv.reservations.infrastructure.datasource.CreatedTime;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
interface VisitRecordMapper {

  void record(
      @Param("receiptNumber") ReceiptNumber receiptNumber,
      @Param("visit") Visit visit,
      @Param("createdTime") CreatedTime createdTime);
}
