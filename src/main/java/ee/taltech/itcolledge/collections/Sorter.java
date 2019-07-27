package ee.taltech.itcolledge.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorter {

    public static List<Integer> sortAsc(List<Integer> numbers){
        Collections.sort(numbers);
        return numbers;
    }

    public static List<Integer> sortDesc(List<Integer> numbers){
        Collections.sort(numbers, Comparator.reverseOrder());
        return numbers;
    }
}
