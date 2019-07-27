package ee.taltech.itcolledge.collections;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class NegativesRemoverTest {

    //todo 1 fix tests
    // ask lecturer about Arrays.asList vs Lists.newArrayList

    @Test
    public void removeNegativeIntegers() {
        assertEquals(null, NegativesRemover.removeNegativeIntegers(null));
        assertEquals(Arrays.asList(1), NegativesRemover.removeNegativeIntegers(Lists.newArrayList(-1, 1)));
    }

    @Test
    public void removeNegativeLongs() {
        assertEquals(null, NegativesRemover.removeNegativeLongs(null));
        assertEquals(Arrays.asList(1L), NegativesRemover.removeNegativeLongs(Arrays.asList(-1L, 1L)));
    }

    @Test
    public void removeNegativeDoubles() {
        assertEquals(null, NegativesRemover.removeNegativeDoubles(null));
        assertEquals(Arrays.asList(1.0), NegativesRemover.removeNegativeDoubles(Arrays.asList(-1.0, 1.0)));
    }

    @Test
    public void removeNegatives_common_method1() {
        assertEquals(null, NegativesRemover.removeNegatives(null));
        assertEquals(Arrays.asList(1), NegativesRemover.removeNegativeIntegers(Lists.newArrayList(-1, 1)));
        assertEquals(Arrays.asList(1L), NegativesRemover.removeNegativeLongs(Arrays.asList(-1L, 1L)));
        assertEquals(Arrays.asList(1.0), NegativesRemover.removeNegativeDoubles(Arrays.asList(-1.0, 1.0)));
    }

    @Test
    public void removeNegatives_common_method2() {
        assertEquals(null, NegativesRemover.removeNegatives2(null));
        assertEquals(Arrays.asList(1), NegativesRemover.removeNegativeIntegers(Lists.newArrayList(-1, 1)));
        assertEquals(Arrays.asList(1L), NegativesRemover.removeNegativeLongs(Arrays.asList(-1L, 1L)));
        assertEquals(Arrays.asList(1.0), NegativesRemover.removeNegativeDoubles(Arrays.asList(-1.0, 1.0)));
    }
}