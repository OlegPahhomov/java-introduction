package ee.taltech.itcolledge.collections;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class NegativesRemover {

    public static List<Integer> removeNegativeIntegers(List<Integer> numbers) {
        if (numbers == null) return null;
        List<Integer> positiveNumbers = new ArrayList<>();
        for (Integer number : numbers) {
            if (number > 0) {
                positiveNumbers.add(number);
            }
        }
        return positiveNumbers;
    }

    public static List<Long> removeNegativeLongs(List<Long> numbers) {
        if (numbers == null) return null;
        List<Long> positiveNumbers = new ArrayList<>();
        for (Long number : numbers) {
            if (number > 0) {
                positiveNumbers.add(number);
            }
        }
        return positiveNumbers;
    }

    public static List<Double> removeNegativeDoubles(List<Double> numbers) {
        if (numbers == null) return null;
        List<Double> positiveNumbers = new ArrayList<>();
        for (Double number : numbers) {
            if (number > 0) {
                positiveNumbers.add(number);
            }
        }
        return positiveNumbers;
    }

    // can you write one(uno, yks, odin) method to replace them all?
    public static List<Number> removeNegatives(List<? extends Number> numbers) {
        if (numbers == null) return null;
        List<Number> positiveNumbers = new ArrayList<>();
        for (Number number : numbers) {
            if (number instanceof Integer) {
                Integer number1 = (Integer) number;
                if (number1 > 0) {
                    positiveNumbers.add(number1);
                }
            } else if (number instanceof Long) {
                Long number1 = (Long) number;
                if (number1 > 0) {
                    positiveNumbers.add(number1);
                }
            } else if (number instanceof Double) {
                Double number1 = (Double) number;
                if (number1 > 0) {
                    positiveNumbers.add(number1);
                }
            }

        }
        return positiveNumbers;
    }

    public static List<Number> removeNegatives2(List<Number> numbers) {
        if (numbers == null) return null;
        List<Number> positives = new ArrayList<>();
        for (Number number : numbers) {
            if (new BigDecimal(number.toString()).signum() >= 0){
                positives.add(number);
            }
        }
        return positives;
    }
}
