package jp.kukv.reservations.infrastructure.datasource.holder.contact;

import jp.kukv.reservations.domain.model.holder.contact.Contact;
import jp.kukv.reservations.domain.model.receipt.ReceiptNumber;
import jp.kukv.reservations.infrastructure.datasource.CreatedTime;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
interface ContactRecordMapper {

  void record(
      @Param("receiptNumber") ReceiptNumber receiptNumber,
      @Param("contact") Contact contact,
      @Param("createdTime") CreatedTime createdTime);
}
