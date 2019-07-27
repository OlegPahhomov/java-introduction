package ee.taltech.itcolledge.collections;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class BiggestElementTest {

    //todo 3 fix tests

    @Test
    public void on_no_elements_nothing_is_returned() {
        assertNull(BiggestElement.findBiggest(new ArrayList<Integer>()));
    }

    @Test
    public void biggest_element_returns_biggest_element_of_the_list() {
        Integer biggest = BiggestElement.findBiggest(Lists.newArrayList(1, 3, 2));
        assertNotNull(biggest);
        assertEquals(3, (int) biggest);
    }
}