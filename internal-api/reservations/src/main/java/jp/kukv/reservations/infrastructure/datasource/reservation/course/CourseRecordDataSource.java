package jp.kukv.reservations.infrastructure.datasource.reservation.course;

import jp.kukv.reservations.application.service.reservation.course.CourseRecordRepository;
import jp.kukv.reservations.domain.model.reservation.ReservationId;
import jp.kukv.reservations.domain.model.reservation.course.Course;
import org.springframework.stereotype.Repository;

@Repository
class CourseRecordDataSource implements CourseRecordRepository {

  CourseRecordMapper courseRecordMapper;

  @Override
  public void specify(ReservationId reservationId, Course course) {
    CreatedTime createdTime = CreatedTime.now();
    courseRecordMapper.record(reservationId, course, createdTime);
  }

  CourseRecordDataSource(CourseRecordMapper courseRecordMapper) {
    this.courseRecordMapper = courseRecordMapper;
  }
}
