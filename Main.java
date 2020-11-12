package ru.geekbrains.java_one.lesson_2.Verhovskii_IA;

public class Main {
    public static void main(String[] args) {

        Staff a0 = new Staff("Vasiliy Kotovich Pupkin", 31);
        System.out.println("Staff fullname: " + a0.getFullName() + " on a position of " + a0.getPosition() + ".");
        Staff a1 = new Staff("Derban Igor Razderbanovich", 31, "2283221337");
        System.out.println("Staff fullname: " + a1.getFullName() + " on a position of " + a1.getPosition() + ".");
        Staff a2 = new Staff("Gevorgyan Gevorg Gurgenovich", "QA Tester", "322223888",
                100000, 42);
        System.out.println("Staff fullname: " + a2.getFullName() + " on a position of " + a2.getPosition() + ".");
        Staff a3 = new Staff("German Anna Djamshutovna", 23, "03");
        System.out.println("Staff fullname: " + a3.getFullName() + " on a position of " + a3.getPosition() + ".");
        Staff a4 = new Staff("Vashington George Ibn Hattab", "911", 300000);
        System.out.println("Staff fullname: " + a4.getFullName() + " on a position of " + a4.getPosition() + ".");
        /*
        // Какой тип данных тут определить вообще не знаю, наверно это как-то связанно с классами, но как изобразить без понятия.
        String[] arrA = new String[5];
        String[0] = a0;
        String[1] = a1;
        String[2] = a2;
        String[3] = a3;
        String[4] = a4;
        for (int i = 0; i <= arrA.length; i++) if (String[i].age > 45) System.out.println(String[i].age); */
    }
}
