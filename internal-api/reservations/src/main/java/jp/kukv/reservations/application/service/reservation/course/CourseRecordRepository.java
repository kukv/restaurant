package jp.kukv.reservations.application.service.reservation.course;

import jp.kukv.reservations.domain.model.reservation.ReservationId;
import jp.kukv.reservations.domain.model.reservation.course.Course;

public interface CourseRecordRepository {
  void specify(ReservationId reservationId, Course course);
}
