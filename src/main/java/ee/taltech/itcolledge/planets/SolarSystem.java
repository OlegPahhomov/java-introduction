package ee.taltech.itcolledge.planets;

public class SolarSystem {

    public static Sun getSun(){
        Sun sun = new Sun();
        sun.setSurfaceTemperatureKelvin(5778);
        return sun;
    }

    public static Planet getPlanet(String name){
        if (name.equalsIgnoreCase("Earth")){
            return getEarth();
        } else if (name.equalsIgnoreCase("Mars")){
            return getMars();
        } else if (name.equalsIgnoreCase("Venus")){
            return getVenus();
        } else if(name.equalsIgnoreCase("Mercury")){
            return getMercury();
        } else {
            throw new UnknownPlanetException("Unknown planet: " + name);
        }
    }

    public static Planet getEarth(){
        Planet earth = planet("Earth");
        earth.setDistanceFromSun(149600000);
        return earth;
    }

    public static Planet getMars(){
        return planet("Mars");
    }

    public static Planet getVenus(){
        return planet("Venus");
    }

    public static Planet getMercury(){
        return planet("Mercury");
    }

    private static Planet planet(String name) {
        Planet planet = new Planet();
        planet.setName(name);
        return planet;
    }
}
