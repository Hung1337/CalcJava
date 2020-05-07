/*
 * Hello c:
 */
package me.hung.calc;

import me.hung.calc.convert.ArabicToRoman;
import me.hung.calc.convert.RomanToArabic;
import me.hung.calc.convert.checkNumber;

public class Calculate {

    public Calculate(String input) {
        String data = input.replaceAll(" ", "");
        String[] calcData;

        if (data.contains("-")) {
            calcData = data.split("-");
            calc(data, calcData, "-");
        } else if (data.contains("+")) {
            calcData = data.split("\\+");
            calc(data, calcData, "\\+");
        } else if (data.contains("/")) {
            calcData = data.split("/");
            calc(data, calcData, "/");
        } else if (data.contains("*")) {
            calcData = data.split("\\*");
            calc(data, calcData, "\\*");
        } else {
            throw new IllegalArgumentException("Invalid arithmetic operation");
        }
    }

    private void calc(String data, String[] calcData, String sign) {
        calcData = data.split(sign);
        String x = calcData[0], y = calcData[1];
        if (checkNumber.isArabic(x, y)) {
            System.out.println(arithmetic(x, y, sign));
        } else if (checkNumber.isRoman(x, y)) {
            int xx = RomanToArabic.romanToArabic(x), yy = RomanToArabic.romanToArabic(y);
            System.out.println(ArabicToRoman.arabicToRoman(arithmetic(xx, yy, sign)));
        } else {
            throw new IllegalArgumentException("Invalid number");
        }
    }

    private int arithmetic(String x, String y, String sign) {
        int xx = Integer.valueOf(x), yy = Integer.valueOf(y);
        switch (sign) {
            case ("-"):
                return xx - yy;
            case ("\\+"):
                return xx + yy;
            case ("/"):
                return xx / yy;
            case ("\\*"):
                return xx * yy;
            default:
                return 0;
        }
    }

    private int arithmetic(int x, int y, String sign) {
        switch (sign) {
            case ("-"):
                return x - y;
            case ("\\+"):
                return x + y;
            case ("/"):
                return x / y;
            case ("\\*"):
                return x * y;
            default:
                return 0;
        }
    }

}
