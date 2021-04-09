package javaPart2.lessonTwo;

public class Main {
    public static void main(String[] args) {

        String[][] matrix = {{"1", "2", "3", "4"},{"5","6","7","8"},{"9","10","11","12"},{"13","14","15","16"}};
        String[][] matrixWrong1 = {{"1", "2", "3*", "4"},{"5","6","7","8"},{"9","10","11","12"},{"13","14","15","16"}};
        String[][] matrixWrong2 = {{"S","H","O","W"},{"M","U","S","T"},{" ", "G", "O", " "},{" ","O","N"," "}};
        String[][] matrixWrong3 = {{"S","H","O","W"},{"M","U","S","T"},{" ", "G", "O", " "},{" ","O"}};


        try {
            someMethod(matrix);
        } catch (MyArraySizeException e) {
            System.out.println("Exception: "+e.toString());
        } catch (MyArrayDataException e) {
            System.out.println("Exception: "+e.toString());
        }

        System.out.println("-----------------------------------");
        try {
            someMethod(matrixWrong1);
        } catch (MyArraySizeException e) {
            System.out.println("Exception: "+e.toString());
        } catch (MyArrayDataException e) {
            System.out.println("Exception: "+e.toString());
        }

        System.out.println("-----------------------------------");
        try {
            someMethod(matrixWrong2);
        } catch (MyArraySizeException e) {
            System.out.println("Exception: "+e.toString());
        } catch (MyArrayDataException e) {
            System.out.println("Exception: "+e.toString());
        }

        System.out.println("-----------------------------------");
        try {
            someMethod(matrixWrong3);
        } catch (MyArraySizeException e) {
            System.out.println("Exception: "+e.toString());
        } catch (MyArrayDataException e) {
            System.out.println("Exception: "+e.toString());
        }

    }

    public static void someMethod(String[][] matrix) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;

        if (matrix.length != 4 || matrix[3].length != 4)
            throw new MyArraySizeException();
        //I check the elements against the table ASCII
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                String element = matrix[i][j];
                if (element.length() > 1){
                    for (int k = 0; k < element.length(); k++) {
                        char ch = element.charAt(k);
                        if (ch > 47 && ch < 58){
                            sum =+ ch;
                        } else {
                           throw new MyArrayDataException(i,j);
                        }
                    }
                } else {
                    char ch = element.charAt(0);
                    if (ch > 47 && ch < 58){
                        sum =+ ch;
                    } else {
                        throw new MyArrayDataException(i,j);
                    }
                }
            }
        }

        System.out.println(sum);

    }
}
