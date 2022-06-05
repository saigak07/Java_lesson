package Lesson07;


import java.util.Scanner;

import static consoleApp.ConsoleApp.scanner;

public class Lesson07 {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String string1 = "Hello user!";

        String string2 = "Hello ";
        string2 += "user!"; // конкатенация

        String string3 = scanner.nextLine(); // "Hello user!"
        String string4 = "Hello user!";

        System.out.println("string1 > " + string1);
        System.out.println("string2 > " + string2);
        System.out.println("string3 > " + string3);
        System.out.println("string4 > " + string4);
        System.out.println("***********");
        System.out.println("string1 = string2> " + (string1 == string2));
        System.out.println("string1 = string3> " + (string1 == string3));
        System.out.println("string1 = string4> " + (string1 == string4));

//        String testString = "Hello";
//        long starTest = System.nanoTime();
//
//        for (int i = 0; i < 50000; i++ ) {
//            testString += i;
//        }
//        float endTest = System.nanoTime() - starTest;
//
//        System.out.println(testString);
//        System.out.println("Time cycle: " + (endTest * 0.000001f) + " ms");

    }
}
