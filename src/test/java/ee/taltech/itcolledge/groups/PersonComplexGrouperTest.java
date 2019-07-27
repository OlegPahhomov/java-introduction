package ee.taltech.itcolledge.groups;

import com.google.common.collect.Lists;
import ee.taltech.itcolledge.maps.Person;
import ee.taltech.itcolledge.maps.Sex;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class PersonComplexGrouperTest {

    public static List<Person> testPeople = Lists.newArrayList(
            new Person("11111", "Donald", "Duck", Sex.MALE),
            new Person("22222", "Great", "President", Sex.MALE),
            new Person("33333", "Cristiano", "Ronaldo", Sex.MALE),
            new Person("44444", "Marilyn", "Monroe", Sex.FEMALE),
            new Person("55555", "Michelle", "Obama", Sex.FEMALE)
    );

    //todo 2 fix tests

    @Test
    public void groupPeopleBySex() {
        Map<Sex, List<Person>> map = PersonComplexGrouper.groupPeopleBySex(testPeople);
        assertEquals(2, map.get(Sex.FEMALE).size());
        assertEquals(3, map.get(Sex.MALE).size());
    }
}