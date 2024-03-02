package jp.kukv.reservations.application.service.holder.contact;

import jp.kukv.reservations.domain.model.holder.contact.Contact;
import jp.kukv.reservations.domain.model.reservation.ReservationId;

public interface ContactRecordRepository {
  void record(ReservationId reservationId, Contact contact);
}
