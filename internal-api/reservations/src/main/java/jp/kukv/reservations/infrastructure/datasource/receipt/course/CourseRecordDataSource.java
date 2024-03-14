package jp.kukv.reservations.infrastructure.datasource.receipt.course;

import jp.kukv.reservations.application.service.receipt.course.CourseRecordRepository;
import jp.kukv.reservations.domain.model.receipt.ReceiptNumber;
import jp.kukv.reservations.domain.model.receipt.course.Course;
import jp.kukv.reservations.domain.model.receipt.course.CourseType;
import jp.kukv.reservations.infrastructure.datasource.CreatedTime;
import org.springframework.stereotype.Repository;

@Repository
class CourseRecordDataSource implements CourseRecordRepository {

  CourseRecordMapper courseRecordMapper;

  @Override
  public void specify(ReceiptNumber receiptNumber) {
    CreatedTime createdTime = CreatedTime.now();
    courseRecordMapper.recordCurse(
        receiptNumber, CourseType.席のみ予約, createdTime, CourseIdentifier.empty());
  }

  @Override
  public void specify(ReceiptNumber receiptNumber, Course course) {
    CreatedTime createdTime = CreatedTime.now();
    CourseIdentifier identifier = CourseIdentifier.empty();
    courseRecordMapper.recordCurse(receiptNumber, CourseType.コース料理予約, createdTime, identifier);
    courseRecordMapper.recordCuisine(identifier, course.cuisine());
  }

  CourseRecordDataSource(CourseRecordMapper courseRecordMapper) {
    this.courseRecordMapper = courseRecordMapper;
  }
}
