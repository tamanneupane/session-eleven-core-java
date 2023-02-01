package day1;

public class Address {

    private String country;
    private String state;
    private String city;
    private String street;

    public Address() {
    }

    public Address(String country, String state, String city, String street) {
        this.country = country;
        this.state = state;
        this.city = city;
        this.street = street;
    }

    public String getCountry() {
        return country;
    }

    public String getState() {
        return state;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }
}
