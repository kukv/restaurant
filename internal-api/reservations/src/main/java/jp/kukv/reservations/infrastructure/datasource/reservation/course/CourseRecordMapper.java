package jp.kukv.reservations.infrastructure.datasource.reservation.course;

import jp.kukv.reservations.domain.model.reservation.ReservationId;
import jp.kukv.reservations.domain.model.reservation.course.Course;
import jp.kukv.reservations.infrastructure.datasource.CreatedTime;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
interface CourseRecordMapper {
  void record(
      @Param("reservationId") ReservationId reservationId,
      @Param("course") Course course,
      @Param("createdTime") CreatedTime createdTime);
}
