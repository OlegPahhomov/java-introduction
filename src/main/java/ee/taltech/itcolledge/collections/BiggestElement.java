package ee.taltech.itcolledge.collections;

import java.util.List;

public class BiggestElement {

    public static Integer findBiggest(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) return null;
        Integer max = numbers.get(0);
        for (Integer number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    //todo ADVANCED
    // write a method and tests that returns biggest and next to biggest element

    //todo ADVANCED
    // write a method and tests that returns a list of biggest elements if there are multiple biggest elements

}
