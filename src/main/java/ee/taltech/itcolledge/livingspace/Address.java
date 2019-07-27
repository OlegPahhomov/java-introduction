package ee.taltech.itcolledge.livingspace;

public class Address {

    private String street;
    private String house;
    private String flat;

    public Address() {
    }

    public Address(String street, String house, String flat) {
        this.street = street;
        this.house = house;
        this.flat = flat;
    }

    public String streetHouseFlat(){
        return String.format("%s %s-%s", street, house, flat);
    }

    public String streetHouse(){
        return String.format("%s %s", street, house);
    }

    public String street(){
        return String.format("%s", street);
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getFlat() {
        return flat;
    }

    public void setFlat(String flat) {
        this.flat = flat;
    }

    @Override
    public String toString() {
        return String.format("%s %s-%s", street, house, flat);
    }
}
