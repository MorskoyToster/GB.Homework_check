package ru.geekbrains.java_one.lesson_2.Verhovskii_IA;

public class Homework_2 {

    public static void main(String[] args) {

    }
    private static void replacement() {
        int[] arr1 = {0, 0, 1, 1, 0, 0, 1, 1};
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (arr1[i] == 1) ? 0 : 1;
            System.out.print(arr1[i] + " ");
        }
    }

    private static void filling(){

            int[] arr3 = new int[7];
            for (int i = 0, b = 1; i < arr3.length; i++) {
                arr3[i] = b +=3;
                System.out.println(arr3[i]);
            }
    }
    private static void changing(){
    int[] arr3 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for(int i = 0; i < arr3.length; i++) {
        if (arr3[i] < 6) {
            arr3[i] = arr3[i] * 2;
        }
        System.out.println (arr3[i]);
    }
}   private static void extremums(){
    int[] arr4 = {5, 10, -5, 2000, 0, 1, 7, 2000, 18, 2};
    int min = arr4[0], max = arr4[0];
        for (int i = 0; i < arr4.length; i++) {
        if (arr4[i] > max) {
            max = arr4[i];
        }
        if (arr4[i] < min) {
            min = arr4[i];
        }
    }
        System.out.println("Максимальное значение: " + max + ". Минимальное значение: " + min);
}
}

