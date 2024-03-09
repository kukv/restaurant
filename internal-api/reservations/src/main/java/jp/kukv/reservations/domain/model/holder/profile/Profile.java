package jp.kukv.reservations.domain.model.holder.profile;

/** 予約者プロフィール */
public class Profile {

  Name name;
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
