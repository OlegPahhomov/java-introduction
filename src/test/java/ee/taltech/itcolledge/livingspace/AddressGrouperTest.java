package ee.taltech.itcolledge.livingspace;

import ee.taltech.itcolledge.maps.Person;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class AddressGrouperTest {

    public List<Person> people = Arrays.asList(
            new Person("11111", "Great", "President", new Address("Sesame street", "2", "16")),
            new Person("22222", "Donald", "Duck", new Address("Sesame street", "2", "16")),
            new Person("33333", "Cristiano", "Ronaldo", new Address("Sesame street", "2", "17")),
            new Person("66666", "James", "Bond", new Address("Sesame street", "3", "12")),
            new Person("77777", "Bob", "Pancake", new Address("Syrup street", "2", "1"))
    );

    //todo 3 fix tests

    @Test
    public void people_living_in_the_same_flat() {
        Map<String, List<Person>> sameFlat = AddressGrouper.getPeopleLivingInTheSameFlat(people);
        assertEquals(4, sameFlat.size());
        List<Person> people = sameFlat.get("Sesame street 2-16");
        assertEquals(2, people.size());
    }

    @Test
    public void people_living_in_the_same_house() {
        Map<String, List<Person>> sameHouse = AddressGrouper.getPeopleLivingInTheSameHouse(people);
        assertEquals(3, sameHouse.size());
        List<Person> people = sameHouse.get("Sesame street 2");
        assertEquals(3, people.size());
    }

    @Test
    public void people_living_in_the_same_street() {
        Map<String, List<Person>> sameStreet = AddressGrouper.getPeopleLivingInTheSameStreet(people);
        assertEquals(2, sameStreet.size());
        List<Person> people = sameStreet.get("Sesame street");
        assertEquals(4, people.size());
    }
}