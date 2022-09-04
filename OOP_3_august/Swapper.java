package OOP_3_august;

public class Swapper {
    static String[] stringArray1 = {"5", "6", "3", "4"};
    static Integer[] integerArray = {1,2,3,10,320,45,10,4};

    public  static void main(String[] args) {

        System.out.println( "Before modification");

        printMassive(integerArray);
        swapElements(integerArray, 0, 7);

        System.out.println( "After modification");
        printMassive(integerArray);
    }

    //Написать метод, который меняет два элемента массива местами (массив может быть любого
    //ссылочного типа)

    public static <T> void swapElements (T array[], int positionA, int positionB){
        T temp;

        temp = array[positionA];
        array[positionA] = array[positionB];
        array[positionB] = temp;
    }

    public static <T> void printMassive(T array[]){
        for (int i = 0; i< array.length; i++){
            System.out.println(array[i]);
        }
    }

}
