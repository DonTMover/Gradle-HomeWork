package ru.dontmover.utils;

public class StringUtils {

    public static boolean isPositiveNumber(String str) {
        try {
            return Integer.parseInt(str) > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

}
