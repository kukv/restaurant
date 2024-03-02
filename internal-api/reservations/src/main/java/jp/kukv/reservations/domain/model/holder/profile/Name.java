package jp.kukv.reservations.domain.model.holder.profile;

import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.validation.constraints.NotEmpty;
import org.hibernate.validator.constraints.Length;

/** 予約者氏名 */
class Name {

  @NotEmpty(message = "予約者氏名は必須")
  @Length(max = 50, message = "予約者氏名は50文字以内")
  @JsonValue
  String value;

  Name(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }

  Name() {}
}
