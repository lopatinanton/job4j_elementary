package ru.job4j.loop;

public class BackWardFor {
    public static int out(int m, int n) {
        for (int i = n; i < m; i++) {
            System.out.println(i);
        }
        return m;
    }

    public static void main(String[] args) {
        BackWardFor.out(99, 0);
    }
}
