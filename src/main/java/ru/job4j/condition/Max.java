package ru.job4j.condition;

public class Max {
    public static int add(int left, int right) {
        return left + right;
    }

    public static int add(int left, int right, int first) {
        return add(left, add(right, first));
    }

    public static int add(int left, int right, int first, int second) {
        return add(right, add(first, second, left));
    }

    public static void main(String[] args) {
        int max = Max.add(2, 2, 1);
        System.out.println(max);
    }
}
