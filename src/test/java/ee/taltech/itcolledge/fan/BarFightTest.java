package ee.taltech.itcolledge.fan;

import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class BarFightTest {

    public static final String MAN_U = "ManU";
    public static final String BARCELONA = "Barcelona";

    //todo 2 make tests pass

    @Test
    public void groupFansByClub() {
        Fan joe = new Fan("Joe", MAN_U);
        Fan victor = new Fan("Victor", MAN_U);
        Fan michael = new Fan("Michael", BARCELONA);
        Fan hernandes = new Fan("Hernandes", BARCELONA);
        Fan joseph = new Fan("Joseph", BARCELONA);
        Map<String, List<Fan>> group = BarFight.groupFansByClub(joe, victor, michael, hernandes, joseph);
        assertNotNull(group);
        assertEquals(2, group.size());

        List<Fan> manuFans = group.get(MAN_U);
        assertNotNull(manuFans);
        assertEquals(2, manuFans.size());
        assertTrue(manuFans.contains(joe));
        assertTrue(manuFans.contains(victor));

        List<Fan> barcaFans = group.get(BARCELONA);
        assertEquals(3, barcaFans.size());
        assertTrue(barcaFans.contains(joseph));
        assertTrue(barcaFans.contains(michael));
        assertTrue(barcaFans.contains(hernandes));

    }
}