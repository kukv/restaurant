package jp.kukv.reservations.domain.model.holder.contact;

import static org.junit.jupiter.api.Assertions.assertEquals;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import java.util.Set;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class メールアドレステスト {

  Validator validator = Validation.buildDefaultValidatorFactory().getValidator();

  @Test
  void メールアドレスの形式が正しい場合エラーにならない() {
    String local = RandomStringUtils.randomAlphabetic(64);
    String domain = RandomStringUtils.randomAlphabetic(60);
    MailAddress mailAddress = new MailAddress(String.format("%s@%s.jp", local, domain));

    Set<ConstraintViolation<MailAddress>> violations = validator.validate(mailAddress);
    assertEquals(0, violations.size());
  }

  @Test
  void メールアドレスが空の場合エラーになる() {
    MailAddress mailAddress = new MailAddress("");

    Set<ConstraintViolation<MailAddress>> violations = validator.validate(mailAddress);
    assertEquals(1, violations.size());
  }

  @Test
  void メールアドレスの文字数が129文字以上の場合エラーになる() {
    String local = RandomStringUtils.randomAlphabetic(64);
    String domain = RandomStringUtils.randomAlphabetic(61);
    MailAddress mailAddress = new MailAddress(String.format("%s@%s.jp", local, domain));

    Set<ConstraintViolation<MailAddress>> violations = validator.validate(mailAddress);
    assertEquals(1, violations.size());
  }

  @ParameterizedTest
  @ValueSource(strings = {"a$#~@tsst.com"})
  void メールアドレスの形式が不正の場合エラーになる(String value) {

    MailAddress mailAddress = new MailAddress(String.format(value));

    Set<ConstraintViolation<MailAddress>> violations = validator.validate(mailAddress);
    System.out.println(mailAddress);
    System.out.println(violations.toString());
    assertEquals(1, violations.size());
  }
}
