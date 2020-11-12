package ru.geekbrains.java_one.lesson_1.Verhovskii_IA;

public class checkRange {

    private static boolean trueOrFalse(int number1, int number2) {
        int sum = number1 + number2;
        if (sum > 10 && sum <= 20) {
            return true;
        }
            else {
                return false;
            }
        }

    public static void main(String[] args) {
        int number1 = 25;
        int number2 = -7;

        trueOrFalse(number1, number2);
        boolean result = trueOrFalse(number1, number2);
        System.out.println(result);
    }
}