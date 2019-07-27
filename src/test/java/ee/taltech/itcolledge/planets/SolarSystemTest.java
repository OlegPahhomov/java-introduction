package ee.taltech.itcolledge.planets;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolarSystemTest {

    public static final int _149_600_000 = 149600000;

    @Test
    public void asking_for_sun_returns_sun() {
        Sun sun = SolarSystem.getSun();
        assertNotNull(sun);
        assertEquals(5778, (int) sun.getSurfaceTemperatureKelvin());
        assertEquals(5505, (int) sun.getSurfaceTemperatureCelcius());
    }

    @Test
    public void asking_for_earth_returns_earth() {
        Planet earth = SolarSystem.getEarth();
        validatePlanet("Earth", earth);
        assertEquals(_149_600_000, (long) earth.getDistanceFromSun());
    }

    @Test
    public void you_can_ask_planets_by_their_name() {
        validatePlanet("Earth", SolarSystem.getPlanet("earth"));
        validatePlanet("Mars", SolarSystem.getPlanet("mars"));
        validatePlanet("Venus", SolarSystem.getPlanet("venus"));
        validatePlanet("Mercury", SolarSystem.getPlanet("mercury"));
    }

    @Test(expected = UnknownPlanetException.class)
    public void unknown_planet_throws_unknown_planet_exception() {
        SolarSystem.getPlanet("unknown");
    }

    private void validatePlanet(String name, Planet earth) {
        assertNotNull(earth);
        assertEquals(name, earth.getName());
    }
}