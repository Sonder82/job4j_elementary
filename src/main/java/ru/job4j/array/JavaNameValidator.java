package ru.job4j.array;

import static java.lang.Character.isDigit;
import static java.lang.Character.isUpperCase;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean valid;
        if (name.isEmpty() || !checkFirstChar(name)) {
        valid = false;
           } else {
            valid = checkChar(name);
        }
        return valid;
    }

    public static boolean checkFirstChar(String name) {
        boolean valid = true;
        int firstChar = name.charAt(0);
        if (isDigit(firstChar) || isSpecialSymbol(firstChar)
                || isUpperCase(firstChar) || !isLowerLatinLetter(firstChar)) {
            valid = false;
        }
        return valid;
    }

    public static boolean checkChar(String name) {
        boolean valid = true;
        for (int i = 1; i < name.length(); i++) {
            int code = name.charAt(i);
            if (!isDigit(code) && !isSpecialSymbol(code) && !isUpperLatinLetter(code) && !isLowerLatinLetter(code)) {
                valid = false;
                break;
            }
        }
        return valid;
    }

    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    public static boolean isUpperLatinLetter(int code) {
        return code >= 65 && code <= 90;
    }

    public static boolean isLowerLatinLetter(int code) {
        return code >= 97 && code <= 122;
    }
}
