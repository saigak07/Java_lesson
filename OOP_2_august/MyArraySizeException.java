package OOP_2_august;

public class MyArraySizeException extends Exception{

    public MyArraySizeException(){

        System.out.println("Размерность массива должна быть " + Main.massiveSize + "x" + Main.massiveSize);
    }
}
