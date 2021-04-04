package javaPart1;

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
        System.out.println(numberPolarityCheckBoolean(-5455));
        System.out.println(numberPolarityCheckBoolean(5656656));
        System.out.println(numberPolarityCheckBoolean(0));

        splitTasks(7);
        greetingByName("Андрей");

        splitTasks(8);
        checkLeapYear(1200);
        checkLeapYear(1100);
        checkLeapYear(2020);
        checkLeapYear(2021);
        checkLeapYear(2022);
        checkLeapYear(2023);


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
        return sum >= 10 && sum <= 20;
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
        return number <= 0;
    }

    //----------------------------------------------------Task 7
    //a method that is passed a name string as a parameter. The method should print a welcome message to the console
    private static void greetingByName (String name) {
        System.out.println("Привет, " + name + "!");
    }

    //----------------------------------------------------Task 8
    //a method that determines if the year is a leap year and prints a message to the console.
    private static void checkLeapYear(int year) {
        if (year %100==0 && year %400 ==0 )
            System.out.println(year + " is leap year");

        else if (year % 4 == 0 && year % 100 > 0)
            System.out.println(year + " is leap year");

        else if (year % 100 == 0)
            System.out.println(year + " is not leap year");

        else
            System.out.println(year + " is not leap year");
    }


    public static void splitTasks (int numberTusk) {
        System.out.println("------------- Task # " + numberTusk);
    }


}


