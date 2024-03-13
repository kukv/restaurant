package jp.kukv.reservations.application.service.diners;

import jp.kukv.reservations.domain.model.diners.DinersId;
import jp.kukv.reservations.domain.model.receipt.ReceiptNumber;

/** レストラン会員との予約連携サービス */
public class DinnersLinkageRecordService {

  DinnersLinkageRecordRepository dinnersLinkageRecordRepository;

  /** 連携する */
  public void linkage(ReceiptNumber receiptNumber, DinersId dinersId) {
    dinnersLinkageRecordRepository.linkage(receiptNumber, dinersId);
  }

  DinnersLinkageRecordService(DinnersLinkageRecordRepository dinnersLinkageRecordRepository) {
    this.dinnersLinkageRecordRepository = dinnersLinkageRecordRepository;
  }
}
