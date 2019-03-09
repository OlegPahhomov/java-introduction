package ee.taltech.itcolledge.groups;

import com.google.common.collect.Lists;
import ee.taltech.itcolledge.maps.Person;
import ee.taltech.itcolledge.maps.Sex;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonComplexGrouper {

    public static Map<Sex, List<Person>> groupPeopleBySex(List<Person> people) {
        //todo in streams we will do this like this:
        // return people.stream().collect(Collectors.groupingBy(Person::getSex));
        // as we haven't learned streams yet, we go
        HashMap<Sex, List<Person>> map = new HashMap<>();
        for (Person person : people) {
            List<Person> list = map.get(person.getSex());
            if (list == null){ // map doesnt have the key yet
                map.put(person.getSex(), Lists.newArrayList(person)); // add new map entry with list of people containing our person
            } else { //map has a key, so we must or person to the lest
                list.add(person);
            }
        }

        return map;
    }
}
