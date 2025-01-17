
class Person {
    private String name;
    private String surname;
    private Address address;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(String city, String street, String zipCode) {
        this.address = new Address(street, city, zipCode);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFullName() {
        return name + " " + surname;
    }

    @Override
    public String toString() {
        return this.getFullName();
    }
}
