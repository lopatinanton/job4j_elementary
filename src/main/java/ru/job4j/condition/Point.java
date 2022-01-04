package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static double distance1(int x3, int y3, int x4, int y4) {
        return Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2));
    }

    public static double distance2(int x5, int y5, int x6, int y6) {
        return Math.sqrt(Math.pow(x6 - x5, 2) + Math.pow(y6 - y5, 2));
    }

    public static double distance3(int x7, int y7, int x8, int y8) {
        return Math.sqrt(Math.pow(x8 - x7, 2) + Math.pow(y8 - y7, 2));
    }

    public static void main(String[] args) {
        double d = Point.distance(0, 0, 2, 0);
        System.out.println("d = (0, 0) to (2, 0) " + d);
        double d1 = Point.distance1(0, 0, 3, 0);
        System.out.println("d1 = (0, 0) to (3, 0) " + d1);
        double d2 = Point.distance2(4, 0, 0, 0);
        System.out.println("d2 = (4, 0) to (0, 0) " + d2);
        double d3 = Point.distance3(0, 0, 0, 5);
        System.out.println("d3 = (0, 0) to (0, 5) " + d3);
    }
}

