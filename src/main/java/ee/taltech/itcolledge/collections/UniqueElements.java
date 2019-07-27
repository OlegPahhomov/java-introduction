package ee.taltech.itcolledge.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class UniqueElements {

    public static List<Integer> removeDuplicates(List<Integer> numbers){
        return new ArrayList<>(new HashSet<>(numbers));
    }
}
