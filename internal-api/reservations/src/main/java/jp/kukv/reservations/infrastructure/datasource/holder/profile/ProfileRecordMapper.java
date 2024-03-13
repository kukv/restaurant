package jp.kukv.reservations.infrastructure.datasource.holder.profile;

import jp.kukv.reservations.domain.model.holder.profile.Profile;
import jp.kukv.reservations.domain.model.receipt.ReceiptNumber;
import jp.kukv.reservations.infrastructure.datasource.CreatedTime;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
interface ProfileRecordMapper {
  void record(
      @Param("receiptNumber") ReceiptNumber receiptNumber,
      @Param("profile") Profile profile,
      @Param("createdTime") CreatedTime createdTime);
}
