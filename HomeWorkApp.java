public class HomeWorkApp {


    public static void main(String[] args) {
        printThreeWords();


        checkSumSign(30, -60);

        printColor (105);

        compareNumbers (8,12);
    }


    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");


    }


    public static void checkSumSign(int a, int b) {
        if ((a + b) >= 0) {
            System.out.println("Summ pozitive");
        } else {
            System.out.println("Summ negative");
        }
    }


    public static void printColor(int value){
        if (value <=0) {
            System.out.println("Red");
        } else if ((value >0)&(value<100)){
            System.out.println("Yellow");
        } else if (value>100) {
            System.out.println("Green");
        }
    }

    public static void compareNumbers(int a, int b) {
            if (a>=b){
                System.out.println("a>=b");
            } else {
                System.out.println("a<b");
            }
    }

    }



