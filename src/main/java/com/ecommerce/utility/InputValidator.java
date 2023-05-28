package com.ecommerce.utility;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputValidator {
    private static final String USERNAME_REGEX = "^[a-zA-Z0-9_]+$";
    private static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
    private static final String PASSWORD_REGEX = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).{8,}$";
    private static final String INVALID_CHARACTERS_REGEX = "[^a-zA-Z0-9._-]";

    public static String getValidEmail(String input) {
        String emailRegex = "\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}\\b";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(input);

        if (matcher.find()) {
            return matcher.group();
        }

        return null; // Return null if no valid email found
    }

    public static String getValidFullName(String input) {
        String nameRegex = "^[A-Za-z\\s]+$";
        Pattern pattern = Pattern.compile(nameRegex);
        Matcher matcher = pattern.matcher(input);

        if (matcher.find()) {
            return  matcher.group();
        }

        return null; // Return null if no valid full name found
    }

    public static boolean isValidUsername(String username) {
        return Pattern.matches(USERNAME_REGEX, username);
    }

    public static boolean isValidEmail(String email) {
        return Pattern.matches(EMAIL_REGEX, email);
    }

    public static boolean isValidPassword(String password) {
        return Pattern.matches(PASSWORD_REGEX, password);
    }

    public static String sanitizeInput(String input) {
        return input.replaceAll(INVALID_CHARACTERS_REGEX, "");
    }
}
