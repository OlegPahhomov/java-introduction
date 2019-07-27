package ee.taltech.itcolledge.numbers;

public class VariableCapNumberCalculator {

    private Integer cap;

    public VariableCapNumberCalculator(Integer cap) {
        this.cap = cap;
    }

    public int sum(int x1, int x2) {
        int sum = x1 + x2;
        return sum <= cap ? sum : cap;
    }
}
