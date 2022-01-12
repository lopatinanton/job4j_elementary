package ru.job4j.condition;

public class LogicNot {
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return !isEven(num);
    }

    public static boolean notPositive(int num) {
        return !isPositive(num);
    }

    public static boolean notEvenAndPositive(int num) {
        return notEven(num) && isPositive(num);
    }

    public static boolean evenOrNotPositive(int num) {
        return isEven(num) || notPositive(num);
    }

    public static void main(String[] args) {
        boolean even = LogicNot.isEven(2);
        System.out.println(even);
        boolean positive = LogicNot.isPositive(3);
        System.out.println(positive);
        boolean noteven = LogicNot.notEven(3);
        System.out.println(noteven);
        boolean notpositive = LogicNot.notPositive(2);
        System.out.println(notpositive);
        boolean rsl1 = LogicNot.notEvenAndPositive(-5);
        System.out.println(rsl1);
        boolean rsl2 = LogicNot.evenOrNotPositive(3);
        System.out.println(rsl2);
    }

}

