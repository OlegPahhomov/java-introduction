package ee.taltech.itcolledge.maps;

import ee.taltech.itcolledge.livingspace.Address;

public class Person {

    private String idCode;
    private String firstName;
    private String lastName;
    private Sex sex;
    private Address address;

    public Person(String idCode, String firstName, String lastName) {
        this.idCode = idCode;
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = Sex.MALE;
    }

    public Person(String idCode, String firstName, String lastName, Sex sex) {
        this.idCode = idCode;
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
    }

    public Person(String idCode, String firstName, String lastName, Address address) {
        this.idCode = idCode;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public String getIdCode() {
        return idCode;
    }

    public void setIdCode(String idCode) {
        this.idCode = idCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
