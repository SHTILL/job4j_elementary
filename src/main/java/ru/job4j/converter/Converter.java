package ru.job4j.converter;

/**
 * Convertor
 * @author Koryakin Vasiliy
 * @since 27.03.2020
 * @version 1
 */
public class Converter {
    /**
     * rubleToEuro, convert rubbles to euros. exchange rate is 70rubles per euro
     * @param value number of rubles to be converted
     * @return number of euros. result of conversion
     */
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    /**
     * rubleToDollar, convert rubbles to dollars. exchange rate is 60rubles per dollar
     * @param value number of rubles to be converted
     * @return number of dollars. result of conversion
     */
    public static int rubleToDollar(int value) {
        int rsl = value / 60;
        return rsl;
    }

    /**
     * Main, calls methods, compare results with expected values, prints corresponding messages
     * @param args not used
     */
    public static void main(String[] args) {
        int in = 140;
        int expected = 2;
        int out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 Euros. Test result : " + passed);

        in = 180;
        expected = 3;
        out = rubleToDollar(in);
        passed = expected == out;
        System.out.println("180 rubles are 3 Dollars. Test result : " + passed);
    }
}
