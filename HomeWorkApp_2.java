public class HomeWorkApp_2 {

    public static void main(String[] args) {

        SummOfTwoNumber(5, 10);
        System.out.println ("**********************");
        WhatNumber(-25);
        System.out.println ("**********************");
        IntegerNumber(60);
        System.out.println ("**********************");
        PrintString("String", 8);
        System.out.println ("**********************");


        }

//1. Написать метод, принимающий на вход два целых числа и проверяющий,
//что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true,
//в противном случае – false.

    public static boolean SummOfTwoNumber(int value1, int value2) {
        if (((value1 + value2) > 10) & ((value1 + value2) <= 20)) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }

    //2. Написать метод, которому в качестве параметра передается целое число,
//метод должен напечатать в консоль, положительное ли число передали или отрицательное.
//Замечание: ноль считаем положительным числом.
    public static void WhatNumber(int a) {
        if (a >= 0) {
            System.out.println("positive number");
        } else {
            System.out.println("negative number");
        }
    }

    //3. Написать метод, которому в качестве параметра передается целое число.
//Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
    public static boolean IntegerNumber(int a) {
        if (a >= 0) {
            System.out.println("false");
            return false;
        } else {
            System.out.println("true");
            return true;
        }

    }

    //4. Написать метод, которому в качестве аргументов передается строка и число,
//метод должен отпечатать в консоль указанную строку, указанное количество раз;
    public static void PrintString(String a, int b) {
        for (int i = 0; i < b; i++)
            System.out.println(a);
    }

}
