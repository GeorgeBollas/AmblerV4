package au.com.gravitywave.entities;

/**
 * Created by georg on 11/07/2017.
 */

public class Person extends EntityBase {

    public Person(int personId, String firstName, String lastName, String address) {
        this.personId = personId;
        FirstName = firstName;
        LastName = lastName;
        Address = address;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    private int personId;
    private String FirstName;
    private String LastName;

    private String Address;
}
