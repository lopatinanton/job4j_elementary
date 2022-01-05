package ru.job4j.condition;

public class Liken {
    public static void main(String[] args) {
         int first = 10;
         int second = 9;
         System.out.println(first + " > " + second + " = " + true); /* first больше second? */

        //result = first < second; /* first меньше second? */
         System.out.println(first + " < " + second + " = " + false);

        //result = first == second; /* first равна second? */
         System.out.println(first + " == " + second + " = " + false);
    }
}
