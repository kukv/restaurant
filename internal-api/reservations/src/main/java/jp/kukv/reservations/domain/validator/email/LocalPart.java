package jp.kukv.reservations.domain.validator.email;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/** ローカルパート */
class LocalPart {

  String value;

  LocalPart(String value) {
    this.value = value;
  }

  final Pattern delimiter = Pattern.compile("\\.");
  final Pattern approvePattern = Pattern.compile("[\\-0-9A-Za-z+]+");

  boolean isValid() {
    String[] names = delimiter.split(value, -1);
    for (String name : names) {
      Matcher matcher = approvePattern.matcher(name);
      if (!matcher.matches()) return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return value;
  }

  LocalPart() {}
}
