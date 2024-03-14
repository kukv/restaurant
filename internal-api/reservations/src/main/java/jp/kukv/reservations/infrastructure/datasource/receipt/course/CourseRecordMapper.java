package jp.kukv.reservations.infrastructure.datasource.receipt.course;

import jp.kukv.reservations.domain.model.receipt.ReceiptNumber;
import jp.kukv.reservations.domain.model.receipt.course.CourseType;
import jp.kukv.reservations.domain.model.receipt.course.cuisine.Cuisine;
import jp.kukv.reservations.infrastructure.datasource.CreatedTime;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
interface CourseRecordMapper {

  void recordCurse(
      @Param("receiptNumber") ReceiptNumber receiptNumber,
      @Param("courseType") CourseType courseType,
      @Param("createdTime") CreatedTime createdTime,
      @Param("courseIdentifier") CourseIdentifier courseIdentifier);

  void recordCuisine(
      @Param("courseIdentifier") CourseIdentifier courseIdentifier,
      @Param("cuisine") Cuisine cuisine);
}
