package OOP_2_august;

public class MyArraySizeException extends Exception{

    public MyArraySizeException(){

        System.out.println("����������� ������� ������ ���� " + Main.massiveSize + "x" + Main.massiveSize);
    }
}
