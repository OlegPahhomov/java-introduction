package ee.taltech.itcolledge.collections;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class SmallestElementTest {

    //todo 4 fix tests

    @Test
    public void on_no_elements_nothing_is_returned() {
        assertNull(SmallestElement.findSmallest(new ArrayList<Integer>()));
    }

    @Test
    public void biggest_element_returns_biggest_element_of_the_list() {
        Integer smallest = SmallestElement.findSmallest(Lists.newArrayList(3, 1, 2));
        assertNotNull(smallest);
        assertEquals(1, (int) smallest);
    }
}