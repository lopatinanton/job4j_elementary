package ru.job4j.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] numbers = {{1}, {3, 5}, {6, 9, 4}, {2, 8, 0, -1}};
        for (int[] number : numbers) {
            System.out.println("Размер вложенного массива равен: " + number.length);
        }
    }
}
