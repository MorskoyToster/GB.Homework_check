package ru.geekbrains.java_one.lesson_6.Verhovskii_IA;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Attempts {

    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("notes.txt", false)) {
            String text = "Java is a class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible \n";
            writer.write(text);

        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
        try (
                FileReader reader = new FileReader("notes.txt")) {
            int c;
            while ((c = reader.read()) != -1) {

                System.out.print((char) c);
            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
        try (FileWriter writer = new FileWriter("notes1.txt", false)) {
            String text = "Java is good, and so you should";
            writer.write(text);

        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
        try (
                FileReader reader = new FileReader("notes1.txt")) {
            int b;
            while ((b = reader.read()) != -1) {

                System.out.print((char) b);
            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}



