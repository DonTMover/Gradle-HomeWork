package ru.clevertec.utils;

public class StringUtils {

    public static boolean isPositiveNumber(String str) {
        try {
            int number = Integer.parseInt(str);
            return number > 0;
        } catch (Exception e) {
            return false;
        }
    }


}
