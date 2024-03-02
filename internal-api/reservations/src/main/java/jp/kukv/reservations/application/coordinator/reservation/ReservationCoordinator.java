package jp.kukv.reservations.application.coordinator.reservation;

import jp.kukv.reservations.application.service.holder.contact.ContactRecordService;
import jp.kukv.reservations.application.service.holder.profile.ProfileRecordService;
import jp.kukv.reservations.application.service.reservation.ReservationRecordService;
import jp.kukv.reservations.application.service.reservation.course.CourseRecordService;
import jp.kukv.reservations.domain.model.holder.Holder;
import jp.kukv.reservations.domain.model.reservation.Reservation;
import jp.kukv.reservations.domain.model.reservation.ReservationId;
import jp.kukv.reservations.domain.model.reservation.ReservationRule;
import org.springframework.stereotype.Service;

/** 予約受付 */
@Service
public class ReservationCoordinator {

  ReservationRecordService reservationRecordService;
  CourseRecordService courseRecordService;
  ProfileRecordService profileRecordService;
  ContactRecordService contactRecordService;

  /** 予約する */
  public ReservationId reserve(Reservation reservation, Holder holder) {
    ReservationRule rule = new ReservationRule(reservation);
    rule.check();

    ReservationId reservationId = reservationRecordService.reserve(reservation);

    courseRecordService.specify(reservationId, reservation.course());

    profileRecordService.record(reservationId, holder.profile());
    contactRecordService.record(reservationId, holder.contact());

    return reservationId;
  }

  ReservationCoordinator(
      ReservationRecordService reservationRecordService,
      CourseRecordService courseRecordService,
      ProfileRecordService profileRecordService,
      ContactRecordService contactRecordService) {
    this.reservationRecordService = reservationRecordService;
    this.courseRecordService = courseRecordService;
    this.profileRecordService = profileRecordService;
    this.contactRecordService = contactRecordService;
  }
}
