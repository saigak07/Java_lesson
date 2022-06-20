package DZ2;

public class MyArraySizeException extends Exception{

    public MyArraySizeException(){

        System.out.println("Размерность массива должна быть " + Main.massiveSize + "x" + Main.massiveSize);
    }
}
