package ru.geekbrains.java_one.lesson_1.Verhovskii_IA;

public class Formula {

    private static float complexArithmetic(int a, int b, int c, int d) {
        return a * (b + c / d);
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        complexArithmetic(a,b,c,d);
        float result = complexArithmetic(a,b,c,d);
        System.out.println(result);
    }
}
