package ru.dontmover.utils;

public class StringUtils {

        public static boolean isPositiveNumber(String str) {
            try {
                if (Integer.parseInt(str) > 0) {
                    return true;
                } else {
                    return false;
                }
            }catch (Exception e){
                e.printStackTrace();
            }
            return false;
        }

}