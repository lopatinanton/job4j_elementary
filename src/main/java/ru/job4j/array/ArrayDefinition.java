package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surname = new String[100500];
        float[] prices = new float[40];
        System.out.println("Размер массива равен: " + ages.length + System.lineSeparator() + "Размер массива равен: " + surname.length + System.lineSeparator() + "Размер массива равен: " + prices.length);

        String[] names = new String[4];
        names[0] = "Антон Лопатин";
        names[1] = "Дмитрий Гордеев";
        names[2] = "Алена Жук";
        names[3] = "Максим Немухин";
        System.out.println(System.lineSeparator() + names[3]);
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
    }
}
