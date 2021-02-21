import java.util.Arrays;

public class SecondLesson {

    public static void main(String[] args) {

        //--------------------Task 1
        int[] array = {0, 1, 1, 0, 1, 0, 0 , 0 , 1, 0};
        for (int i = 0; i < array.length; i++) {
            switch (array[i]) {
                case 1 -> array[i] = 0;
                case 0 -> array[i] = 1;
            }
        }
        FirstLesson.splitTasks(1);
        System.out.println(Arrays.toString(array));

        //--------------------Task 2
        int[] array2 = new int[8];
        int count = 0;
        for (int i = 0; i < array2.length; i++) {
            array2[i] = count;
            count += 3;
        }
        FirstLesson.splitTasks(2);
        System.out.println(Arrays.toString(array2));

        //--------------------Task 3
        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array3.length; i++) {
            if (array3[i]<6) array3[i] = array3[i] * 2;
        }
        FirstLesson.splitTasks(3);
        System.out.println(Arrays.toString(array3));

        //--------------------Task 4
        int x = 10;
        int y = 10;
        int[][] matrix = new int[y][x];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = 1;
            }
        }
        FirstLesson.splitTasks(4);
        for (int[] anArr : matrix) {
            for (int anAnArr : anArr) {
                System.out.print(anAnArr);
            }
            System.out.println();
        }

        //--------------------Task 5
        int[] array4 = {34, 3, 547, 12, 45, -66, 0, 1000000, 45, 675, 44 , -11, 221};
        int min = array4[0];
        int max = array4[0];

        for (int i = 1; i < array4.length; i++) {
            if (min > array4[i]) min = array4[i];
            if (max < array4[i]) max = array4[i];
        }

        FirstLesson.splitTasks(5);
        System.out.println(Arrays.toString(array4) + "\n" + "min = " + min + "\n"
                + "max = " + max);
    }
}
