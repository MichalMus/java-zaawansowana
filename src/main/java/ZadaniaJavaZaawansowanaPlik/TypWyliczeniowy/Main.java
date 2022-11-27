package ZadaniaJavaZaawansowanaPlik.TypWyliczeniowy;

import ZadaniaJavaZaawansowanaPlik.TypWyliczeniowy.zd1.Weekday;
import ZadaniaJavaZaawansowanaPlik.TypWyliczeniowy.zd2.PackageSize;
import ZadaniaJavaZaawansowanaPlik.TypWyliczeniowy.zd3.Converter;
import ZadaniaJavaZaawansowanaPlik.TypWyliczeniowy.zd3.TemperatureConvert;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Weekday w = Weekday.SUNDAY;
//        System.out.println(w.isHoliday());
//        w.whichIsGreater(Weekday.FRIDAY);

        System.out.println(PackageSize.getPackageSize(25, 30));
        TemperatureConvert tc = TemperatureConvert.C_K;
        float t = TemperatureConvert.convertTemperature("Celcjusz", "Kelvin", 32);
        System.out.println(t);

        int[] original = new int[]{1, 2, 3, 4};
        int[] copiedResult = Arrays.copyOf(original, 3);
        System.out.println(Arrays.toString(copiedResult)); // [1, 2, 3]
    }
}