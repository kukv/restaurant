package jp.kukv.reservations.domain.validator.email;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.*;

@Target(FIELD)
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = {MailAddressValidator.class})
@Repeatable(Email.List.class)
public @interface Email {

  String message() default "{jp.kukv.auth.domain.policy.email.Email.message}";

  Class<?>[] groups() default {};

  Class<? extends Payload>[] payload() default {};

  @Target(FIELD)
  @Retention(RUNTIME)
  @Documented
  @interface List {
    Email[] value();
  }
}
