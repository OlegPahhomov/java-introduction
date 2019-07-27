package ee.taltech.itcolledge.fan;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BarFight {

    public static Map<String, List<Fan>> groupFansByClub(Fan... fans) {
        return Stream.of(fans)
                .collect(Collectors.groupingBy(fan -> fan.getFavoriteClub()));
    }

}
