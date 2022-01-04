package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
            }

    public static double subAndDiv(double first, double second) {
        return sub(first, second)
                + div(first, second);
            }

    public static double total(double first, double second) {
        return subAndDiv(first, second) + sumAndMultiply(first, second);
            }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + subAndDiv(20, 10));
        System.out.println("Результат расчета равен; " + total(10, 20));

    }
}
