

public class FirstLesson {

    //--------------------------------------------------Task 1
    public static void main(String[] args) {

        // ---------------------------------------------Task 2
        // from -128 to 127 and takes 1 byte
        byte b = 111;

        // from -32768 to 32767 and takes 2 byte
        short s = 22222;

        // from -2147483648 to 2147483647 and takes 4 byte
        int i = 100000000;

        // from –9 223 372 036 854 775 808 to 9 223 372 036 854 775 807 and takes 8 byte
        long  l = 999999999999999999L;

        //stores true or false
        boolean isGood = true;

        //stores a floating point number from ± 4.9 * 10-324 to ± 1.8 * 10308 and occupies 8 bytes
        double d = 3.14;

        //stores a floating point number from -3.4 * 1038 to 3.4 * 1038 and takes 4 bytes
        float f = 5.33f;

        //stores a single UTF-16 encoded character and takes 2 bytes, so the range of stored values is 0 to 65535
        char c = 43;
        System.out.println(c);

        splitTasks(3);
        System.out.println(evaluatingExpression(55.22f, 45.85f, 10.9f, 5000.3f));

        splitTasks(4);
        System.out.println(rangeOfTwoNumbers(5, 5));

        splitTasks(5);
        numberPolarityCheck(-5455);
        numberPolarityCheck(5656656);
        numberPolarityCheck(0);

        splitTasks(6);


    }
    //----------------------------------------------------Task 3
    //method that evaluates the expression a * (b + (c / d)) and returns the result
    private static float evaluatingExpression(float a, float b, float c, float d){
        return a * (b + (c / d));
    }

    //----------------------------------------------------Task 4
    //calculating a range of sum of numbers
    private static boolean rangeOfTwoNumbers(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) return true;
        return false;
    }

    //----------------------------------------------------Task 5
    //whether the number was passed positive or negative.
    private static void numberPolarityCheck (long number) {
        if (number >= 0) System.out.println("number " + number + " is positive");
        else System.out.println("number " + number + " is negative");
    }

    //----------------------------------------------------Task 6
    //a method that is passed an integer as a parameter. The method should return true if the number is negative,
    //and return false if it is positive.
    private static boolean numberPolarityCheckBoolean (long number) {
        if (number <= 0 ) return true;
        return false;
    }




    public static void splitTasks (int numberTusk) {
        System.out.println("------------- Task # " + numberTusk);
    }


}


