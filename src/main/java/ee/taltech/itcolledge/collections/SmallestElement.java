package ee.taltech.itcolledge.collections;

import java.util.List;

public class SmallestElement {

    public static Integer findSmallest(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) return null;
        Integer min = Integer.MAX_VALUE;
        for (Integer number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    //todo ADVANCED
    // write a method and tests that returns smallest and next to smallest element

    //todo ADVANCED
    // write a method and tests that returns a list of smallest elements if there are multiple smallest elements

}
