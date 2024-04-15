package edu.colval.exercises.td60.bll.model;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class PasswordStrengthValidator implements ConstraintValidator<PasswordValidator, String> {

    List<String> weakPassword;

    private static final String PASSWORD_PATTERN =
            "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";

    @Override
    public void initialize(PasswordValidator constraintAnnotation) {
        weakPassword = Arrays.asList("Password1@", "Abcdefg1@", "12345678A@", "Qwerty12@", "Admin123@", "Password123@",
                "Qwertyui1@", "1Q2w3e4r@", "Abcdef12@", "Admin@123");
    }

    @Override
    public boolean isValid(String password, ConstraintValidatorContext context) {
        if (password == null) {
            return false;
        }

        if (weakPassword.contains(password)) {
            return false;
        }

        return Pattern.compile(PASSWORD_PATTERN).matcher(password).matches();
    }
}
