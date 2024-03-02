package jp.kukv.reservations.domain.model.holder.profile;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/** 予約者プロフィール */
public class Profile {

  @NotNull(message = "予約者氏名は必須")
  @Valid
  @JsonProperty
  Name name;

  @NotNull(message = "予約者生年月日は必須")
  @Valid
  @JsonProperty
  BirthDate birthDate;

  Profile(Name name, BirthDate birthDate) {
    this.name = name;
    this.birthDate = birthDate;
  }

  @Override
  public String toString() {
    return "Profile{" + "name=" + name + ", birthDate=" + birthDate + '}';
  }

  Profile() {}
}
