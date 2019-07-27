package ee.taltech.itcolledge.numbers;

public class CappedTo100NumberCalculator {

    public static int sum(int x1, int x2) {
        int sum = x1 + x2;
        return sum <= 100 ? sum : 100;
    }



}
