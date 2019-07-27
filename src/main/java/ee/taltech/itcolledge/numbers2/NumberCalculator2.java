package ee.taltech.itcolledge.numbers2;

public class NumberCalculator2 {

    public static int sum(int x1, int x2) {
        return 0;
    }

    public static int sum(int x1, int x2, int x3) {
        return 0;
    }

    public static int sum(int x1, int x2, int x3, int x4) {
        return 0;
    }

    public static int sum(int... xValues) {
        int sum = 0;
        for (int x : xValues) {
            sum += x;
        }
        return sum;
    }

    //todo create method that takes almost infinite amount of variables
    // hint: varargs
}
