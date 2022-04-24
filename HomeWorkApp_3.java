public class HomeWorkApp_3 {


    public static void main(String[] args) {

     System.out.println("First task");

     firstTask();

     System.out.println();

     System.out.println("Second task");

        secondTask ();
        System.out.println();

     System.out.println("Third task");

        thirdTask ();
        System.out.println();

     System.out.println("Fourth task");

        fourthTask ();
        System.out.println();

     System.out.println("Fifth task");


        int test [] = fifthTask(6,8);
//        for (int i = 0; i < test.length; i++) {
//            System.out.print(test[i] + " ");
//        }

    }
//1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например:  С помощью цикла и условия заменить 0 на 1, 1 на 0
    public static void firstTask (){
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
            System.out.print(arr[i] + " ");
        }
    }
//2.Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
    public static void secondTask () {
        int[] array = new int[100];
         for (int i = 0; i < array.length; i++) {
             int m = i + 1;
            array[i] = m;
            System.out.print(array[i] + " ");
        }
    }
//3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2
    public static void thirdTask (){
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;

            }
            System.out.print(arr[i] + " ");
        }
    }
// 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов
//одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами
//(можно только одну из диагоналей, если обе сложно). Определить элементы одной из
//диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0],
//[1][1], [2][2], …, [n][n]
    public static void fourthTask (){
        int[][] arr = new int [6][6] ;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = 0;

                if (i == j) {
                    arr[i][j] = 1;

                }

                System.out.print(arr[i][j] + " | ");
            }
            System.out.println();


        }
    }
// 5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий
//одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
    public static int[] fifthTask (int len, int initialValue){
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
            System.out.print(array[i] + " ");
        }

        return array;

    }
}
