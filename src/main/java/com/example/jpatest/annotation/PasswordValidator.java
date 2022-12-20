package com.example.jpatest.annotation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = PassWordStrengthValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface PasswordValidator {

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    String message() default "Please choose a strong password";
}
