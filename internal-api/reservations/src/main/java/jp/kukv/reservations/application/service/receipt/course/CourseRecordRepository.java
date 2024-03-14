package jp.kukv.reservations.application.service.receipt.course;

import jp.kukv.reservations.domain.model.receipt.ReceiptNumber;
import jp.kukv.reservations.domain.model.receipt.course.Course;

public interface CourseRecordRepository {
  void specify(ReceiptNumber receiptNumber);

  void specify(ReceiptNumber receiptNumber, Course course);
}
