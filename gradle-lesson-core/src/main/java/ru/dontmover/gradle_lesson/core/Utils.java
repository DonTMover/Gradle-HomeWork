package ru.dontmover.gradle_lesson.core;

import ru.dontmover.utils.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Utils {

    public static boolean isAllPositiveNumbers(String... str) {
        List<Boolean> list = new ArrayList<>();
        for (String s : str) {
            list.add(StringUtils.isPositiveNumber(s));
        }

        for (Boolean b : list) {
            if(!b){
                return false;
            }
        }
        return true;
    }
}
