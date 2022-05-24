package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int left, int right, int first) {
        return max(left, max(right, first));
    }

    public static int max(int left, int right, int first, int second) {
        return max(max(left, right), max(first, second));
    }

    public static void main(String[] args) {
        int max = Max.max(2, 2, 1, 8);
        System.out.println(max);
    }
}
