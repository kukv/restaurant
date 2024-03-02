package jp.kukv.reservations.application.service.reservation.course;

import jp.kukv.reservations.domain.model.reservation.ReservationId;
import jp.kukv.reservations.domain.model.reservation.course.Course;
import org.springframework.stereotype.Service;

/** 予約コースサービス */
@Service
public class CourseRecordService {

  CourseRecordRepository courseRecordRepository;

  /** 指定する */
  public void specify(ReservationId reservationId, Course course) {
    courseRecordRepository.specify(reservationId, course);
  }

  CourseRecordService(CourseRecordRepository courseRecordRepository) {
    this.courseRecordRepository = courseRecordRepository;
  }
}
