package ee.taltech.itcolledge.numbers2;

public class Factorial {

    public static long factorial(int n) {
        //rewrite with tertiary if statement (using ? and :) (colon, not a smiley)
        return 1 > n ? 1 : n * factorial(n - 1);
    }

    public static void main(String[] args) {
        //call factorial function with inputs 0, 2, 5, 10, 15, 20
        printFactorial(0);
        printFactorial(2);
        printFactorial(5);
        printFactorial(10);
        printFactorial(15);
        printFactorial(20);
        // what happens on factorial 21?
        printFactorial(21);
        // result overflows long max value and starts from long.minvalue
    }

    private static void printFactorial(int number){
        System.out.println(factorial(number));
    }
}
