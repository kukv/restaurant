package jp.kukv.reservations.infrastructure.datasource;

import java.time.LocalDateTime;

/** 作成日時 */
public class CreatedTime {

  LocalDateTime value;

  CreatedTime(LocalDateTime value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value.toString();
  }

  public static CreatedTime now() {
    return new CreatedTime(LocalDateTime.now());
  }

  CreatedTime() {}
}
