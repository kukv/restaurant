package jp.kukv.reservations.application.service.receipt.course;

import jp.kukv.reservations.domain.model.receipt.ReceiptNumber;
import jp.kukv.reservations.domain.model.receipt.course.Course;
import org.springframework.stereotype.Service;

/** 予約コース記録サービス */
@Service
public class CourseRecordService {

  CourseRecordRepository courseRecordRepository;

  /** 席のみ指定する */
  public void specify(ReceiptNumber receiptNumber) {
    courseRecordRepository.specify(receiptNumber);
  }

  /** コース料理を指定する */
  public void specify(ReceiptNumber receiptNumber, Course course) {
    courseRecordRepository.specify(receiptNumber, course);
  }

  CourseRecordService(CourseRecordRepository courseRecordRepository) {
    this.courseRecordRepository = courseRecordRepository;
  }
}
