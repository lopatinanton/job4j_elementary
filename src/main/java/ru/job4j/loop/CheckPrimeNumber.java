package ru.job4j.loop;

public class CheckPrimeNumber {
    public  static boolean check(int number) {
        boolean prime = true;
        for (int i = number; i <= number; i++) {
            if (number % 2 == 0 || number % -1 == 0) {
                break;
            }
        }
        return prime;
    }
}
