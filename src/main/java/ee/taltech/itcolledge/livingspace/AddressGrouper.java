package ee.taltech.itcolledge.livingspace;

import com.google.common.collect.Lists;
import ee.taltech.itcolledge.maps.Person;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AddressGrouper {

    public static Map<String, List<Person>> getPeopleLivingInTheSameFlat(List<Person> people){
        HashMap<String, List<Person>> map = new HashMap<>();
        for (Person person : people) {
            String address = person.getAddress().streetHouseFlat();
            addToMap(map, person, address);
        }
        return map;
    }

    public static Map<String, List<Person>> getPeopleLivingInTheSameHouse(List<Person> people){
        HashMap<String, List<Person>> map = new HashMap<>();
        for (Person person : people) {
            String address = person.getAddress().streetHouse();
            addToMap(map, person, address);
        }
        return map;
    }

    public static Map<String, List<Person>> getPeopleLivingInTheSameStreet(List<Person> people){
        HashMap<String, List<Person>> map = new HashMap<>();
        for (Person person : people) {
            String address = person.getAddress().street();
            addToMap(map, person, address);
        }
        return map;
    }

    private static void addToMap(HashMap<String, List<Person>> map, Person person, String address) {
        List<Person> list = map.get(address);
        if (list == null){ // map doesnt have the key yet
            map.put(address, Lists.newArrayList(person)); // add new map entry with list of people containing our person
        } else { //map has a key, so we must or person to the lest
            list.add(person);
        }
    }
}
