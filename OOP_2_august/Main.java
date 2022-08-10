package OOP_2_august;


public class Main {
        static Integer  massiveSize = 4;
        static Integer finalSum=0;

        public  static void main(String[] args) {
            String[][] stringArray1 = new String[][] {
                    {"5", "6", "3", "4"},
                    {"1", "6", "3", "7"},
                    {"1", "2", "9", "6"},
                    {"1", "2", "4", "2"}
            };

            String[][] stringArray2 = new String[][] {
                    {"5", "6", "5", "6"},
                    {"1", "8", "m", "7"},
                    {"1", "2", "9", "6"}
            };

            String[][] stringArray3 = new String[][] {
                    {"5", "6", "3", "4", "10"},
                    {"1", "8", "3", "7", "10"},
                    {"1", "2", "9", "6", "10"},
                    {"1", "2", "4", "8", "10"}
            };

            try {
                finalSum = CountElements(stringArray1);
                System.out.println(finalSum);
            } catch (MyArrayDataException e) {
                e.printStackTrace();
            }
        }

        public  static Integer CountElements (String [][] array) throws MyArrayDataException {
            Integer sum = 0;
            try{
                // массив первого уровня
                if (array.length != massiveSize) {
                    throw new MyArraySizeException();
                }
                // массив второго уровня
                for (int i = 0; i < array.length; i++) {
                    if (array[i].length != massiveSize) {
                        throw new MyArraySizeException();
                    }
                }

            }catch(MyArraySizeException size) {
                System.out.println("Caught MyArraySizeException");
            }

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    try{
                    sum = sum + Integer.valueOf(array[i][j]);
                    }catch (NumberFormatException  e){
                        System.out.println("Wrong symbol "+  "\""+ array[i][j] +"\""+ " on position " + i +" & " + j);
                        throw new MyArrayDataException();
                    }

                }
            }

            return sum;


}}
