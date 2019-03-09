package ee.taltech.itcolledge.maps;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class PersonGrouper {

    public static Map<String, Person> groupPeopleByIdCode(List<Person> people) {
        HashMap<String, Person> map = new HashMap<>();
        for (Person person : people) {
            map.put(person.getIdCode(), person);
        }
        return map;
    }

    public static Map<String, Person> groupPeopleByFirstAndLastName(List<Person> people) {
        HashMap<String, Person> map = new HashMap<>();
        for (Person person : people) {
            map.put(person.getFirstName() + " " + person.getLastName(), person);
        }
        return map;
    }

    public static NavigableMap<String, Person> groupPeopleByFirstAndLastNameAsc(List<Person> people) {
        TreeMap<String, Person> map = new TreeMap<>();
        for (Person person : people) {
            map.put(person.getFirstName() + " " + person.getLastName(), person);
        }
        return map;
    }
}
