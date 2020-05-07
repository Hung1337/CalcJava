/*
 * Hello c:
 */
package me.hung.calc.convert;

import java.util.Arrays;
import java.util.List;

public class checkNumber {

    public static boolean isRoman(String num1, String num2) {
        List<String> rome = Arrays.asList("I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X");
        return rome.contains(num1.toUpperCase()) && rome.contains(num2.toUpperCase());
    }

    public static boolean isArabic(String num1, String num2) {
        List<String> arab = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10");
        return arab.contains(num1) && arab.contains(num2);
    }

}
