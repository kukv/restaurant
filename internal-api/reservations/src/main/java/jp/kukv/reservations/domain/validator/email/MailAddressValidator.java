package jp.kukv.reservations.domain.validator.email;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class MailAddressValidator implements ConstraintValidator<Email, String> {

  @Override
  public boolean isValid(String value, ConstraintValidatorContext context) {
    if (value == null || value.isEmpty()) return true;
    if (!org.apache.commons.validator.routines.EmailValidator.getInstance().isValid(value))
      return false;

    MailAddress mailAddress = new MailAddress(value);
    return mailAddress.isValid();
  }
}
