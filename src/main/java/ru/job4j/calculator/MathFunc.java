package ru.job4j.calculator;

public class MathFunc {
    public static int func1(int x) {
               return x * x + 1;
    }

    public static int func2(int x) {
                return 1 / x;
    }

    public static void main(String[] args) {
        int function1 = MathFunc.func1(3);
        int function2 = MathFunc.func2(5);
        int function3 = MathFunc.func1(100);
        int total = function1 + function2 + function3;
        System.out.println(total);
        System.out.println(function3);
    }
}
