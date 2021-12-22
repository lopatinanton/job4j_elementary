package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double x = x2 - x1;
        double y = y2 - y1;
        double first = Math.pow(x, 2);
        double two = Math.pow(y, 2);
        double firstPlusTwo = first + two;
        return Math.sqrt(firstPlusTwo);
    }

    public static void main(String[] args) {
        double d = Point.distance(0, 0, 2, 0);
        System.out.println("d = (0, 0) to (2, 0) " + d);
    }
}
