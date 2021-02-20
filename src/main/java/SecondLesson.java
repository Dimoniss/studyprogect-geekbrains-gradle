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
        //test

    }
}
