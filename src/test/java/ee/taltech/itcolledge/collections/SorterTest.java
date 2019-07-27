package ee.taltech.itcolledge.collections;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SorterTest {

    public static final ArrayList<Integer> INTEGERS = Lists.newArrayList(1, 3, 2, 4);

    //todo 5 fix tests

    @Test
    public void sortAsc_sorts_numbers_in_asc_order() {
        assertEquals(Lists.newArrayList(1, 2, 3, 4), Sorter.sortAsc(INTEGERS));
    }

    @Test
    public void sortDesc_sorts_numbers_in_desc_order() {
        assertEquals(Lists.newArrayList(4, 3, 2, 1), Sorter.sortDesc(INTEGERS));
    }
}