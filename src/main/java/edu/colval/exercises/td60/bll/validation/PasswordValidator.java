package edu.colval.exercises.td60.bll.model;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = PasswordStrengthValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface PasswordValidator {
    String message() default "Password should contain at least one digit, one lowercase, one uppercase, one special character and no whitespace";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
