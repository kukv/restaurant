package jp.kukv.reservations.application.service.holder.contact;

import jp.kukv.reservations.domain.model.holder.contact.Contact;
import jp.kukv.reservations.domain.model.reservation.ReservationId;
import org.springframework.stereotype.Service;

/** 予約者連絡先サービス */
@Service
public class ContactRecordService {

  ContactRecordRepository contactRecordRepository;

  /** 記録する */
  public void record(ReservationId reservationId, Contact contact) {
    contactRecordRepository.record(reservationId, contact);
  }

  ContactRecordService(ContactRecordRepository contactRecordRepository) {
    this.contactRecordRepository = contactRecordRepository;
  }
}
