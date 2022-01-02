package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result  :" + passed);
        float dollar = Converter.rubleToDollar(60);
        System.out.println("60 rubles are " + dollar + " dollar.");
        float input = 60;
        float value = 1;
        float rsl = Converter.rubleToDollar(input);
        boolean comparison = value == rsl;
        System.out.println("60 rubles are 1. Test result :" + comparison);
    }
}
