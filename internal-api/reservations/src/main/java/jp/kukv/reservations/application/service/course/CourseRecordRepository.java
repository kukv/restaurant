package jp.kukv.reservations.application.service.course;

import jp.kukv.reservations.domain.model.course.Course;
import jp.kukv.reservations.domain.model.receipt.ReceiptNumber;

public interface CourseRecordRepository {
  void specify(ReceiptNumber receiptNumber);

  void specify(ReceiptNumber receiptNumber, Course course);
}
