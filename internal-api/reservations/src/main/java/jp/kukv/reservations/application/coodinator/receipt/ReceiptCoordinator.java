package jp.kukv.reservations.application.coodinator.receipt;

import jp.kukv.reservations.application.service.receipt.ReceiptRecordService;
import jp.kukv.reservations.application.service.receipt.course.CourseRecordService;
import jp.kukv.reservations.application.service.receipt.holder.contact.ContactRecordService;
import jp.kukv.reservations.application.service.receipt.holder.profile.ProfileRecordService;
import jp.kukv.reservations.application.service.receipt.visit.VisitRecordService;
import jp.kukv.reservations.domain.model.receipt.ReceiptNumber;
import jp.kukv.reservations.domain.model.receipt.course.Course;
import jp.kukv.reservations.domain.model.receipt.holder.Holder;
import jp.kukv.reservations.domain.model.receipt.visit.Visit;
import org.springframework.stereotype.Service;

/** 予約受付コーディネーター */
@Service
public class ReceiptCoordinator {

  ReceiptRecordService receiptRecordService;
  VisitRecordService visitRecordService;
  ProfileRecordService profileRecordService;
  ContactRecordService contactRecordService;
  CourseRecordService courseRecordService;

  /** 予約を受け付ける */
  public ReceiptNumber receipt(Visit visit, Holder holder, Course course) {
    ReceiptNumber receiptNumber = receiptRecordService.receipt();

    visitRecordService.record(receiptNumber, visit);
    profileRecordService.record(receiptNumber, holder.profile());
    contactRecordService.record(receiptNumber, holder.contact());

    if (course.is席のみ予約()) {
      courseRecordService.specify(receiptNumber);
      return receiptNumber;
    }

    courseRecordService.specify(receiptNumber, course);
    return receiptNumber;
  }

  ReceiptCoordinator(
      ReceiptRecordService receiptRecordService,
      VisitRecordService visitRecordService,
      ProfileRecordService profileRecordService,
      ContactRecordService contactRecordService,
      CourseRecordService courseRecordService) {
    this.receiptRecordService = receiptRecordService;
    this.visitRecordService = visitRecordService;
    this.profileRecordService = profileRecordService;
    this.contactRecordService = contactRecordService;
    this.courseRecordService = courseRecordService;
  }
}
