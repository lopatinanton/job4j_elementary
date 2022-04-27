package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short manHeight) {
        return (manHeight - 100) * 1.15;
    }

    public static double womanWeight(short womanHeight) {
        return (womanHeight - 110) * 1.15;
    }

    public static void main(String[] args) {
        short manHeight = 177;
        double man = Fit.manWeight(manHeight);
        System.out.println("Идеальный вес для мужчин при росте " + manHeight + " см равен " + man + " кг.");
        short womanHeight = 168;
        double woman = Fit.womanWeight(womanHeight);
        System.out.println("Идеальный вес для женщин при росте " + womanHeight + " см равен " + woman + " кг.");
    }
}
