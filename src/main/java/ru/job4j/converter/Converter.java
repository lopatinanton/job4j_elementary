package ru.job4j.converter;

public class Converter {
    public static float rubleToDollar(float value) {
        return value * 1;
    }

    public static float rubleToEuro(float value) {
        return value * 1;
    }

    public static void main(String[] args) {
        float dollar = Converter.rubleToDollar(60);
        System.out.println("1 доллар = " + dollar + "рублей.");
        float euro = Converter.rubleToEuro(70);
        System.out.println("1 евро = " + euro + "рублей.");

    }
}
