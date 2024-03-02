package jp.kukv.reservations.infrastructure.datasource.holder.contact;

import jp.kukv.reservations.application.service.holder.contact.ContactRecordRepository;
import jp.kukv.reservations.domain.model.holder.contact.Contact;
import jp.kukv.reservations.domain.model.reservation.ReservationId;
import jp.kukv.reservations.infrastructure.datasource.reservation.course.CreatedTime;
import org.springframework.stereotype.Repository;

@Repository
class ContactRecordDataSource implements ContactRecordRepository {

  ContactRecordMapper contactRecordMapper;

  @Override
  public void record(ReservationId reservationId, Contact contact) {
    CreatedTime createdTime = CreatedTime.now();
    contactRecordMapper.record(reservationId, contact, createdTime);
  }

  ContactRecordDataSource(ContactRecordMapper contactRecordMapper) {
    this.contactRecordMapper = contactRecordMapper;
  }
}
