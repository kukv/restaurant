package jp.kukv.reservations.presentation.api.receipt;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jp.kukv.reservations.domain.model.course.Course;
import jp.kukv.reservations.domain.model.holder.Holder;
import jp.kukv.reservations.domain.model.visit.Visit;

class ReceiptRequest {

  @NotNull(message = "来店予定は必須")
  @Valid
  @JsonProperty
  Visit visit;

  @NotNull(message = "予約者は必須")
  @Valid
  @JsonProperty
  Holder holder;

  @NotNull(message = "予約コースは必須")
  @Valid
  @JsonProperty
  Course course;

  ReceiptRequest(Visit visit, Holder holder, Course course) {
    this.visit = visit;
    this.holder = holder;
    this.course = course;
  }

  @Override
  public String toString() {
    return "ReceiptRequest{" + "visit=" + visit + ", holder=" + holder + ", course=" + course + '}';
  }

  ReceiptRequest() {}
}
