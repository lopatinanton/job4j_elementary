package ru.job4j.loop;

public class LoopFor {
    public static void main(String[] args) {
        int i;
        boolean result;
        for (i = 0; result = i <= 5; i++) {
            System.out.println(i);
        }
        System.out.println("Индекс после цикла равен: " + i);
        System.out.println("Условие выполнение цикла равно: " + result);
        System.out.println();
        int x;
        for (x = 5; x <= 10; x++)
            System.out.println(x);
    }
}


