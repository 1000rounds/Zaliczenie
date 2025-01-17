public class Address {
    private String street;
    private String city;
    private String fullAddress;

    public Address(String street, String city, String fullAddress) {
        this.street = street;
        this.city = city;
        this.fullAddress = fullAddress;
    }
    public String getFullAddress() {
        return fullAddress;
    }

    public void setFullAddress(String fullAddress) {
        this.fullAddress = fullAddress;
    }
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
