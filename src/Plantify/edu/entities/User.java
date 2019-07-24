package Plantify.edu.entities;

public class User {

    private int id;
    private String firstName;
    private String lastName;
    private String cin;
    private String phoneNumber;
    private String email;
    private String password;
    private String roles;
    private String address;
    private String status;

    public User() {
    }

    public User(int id, String firstName, String lastName, String cin, String phoneNumber, String email, String password, String roles, String address, String status) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.cin = cin;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.password = password;
        this.roles = roles;
        this.address = address;
        this.status = status;
    }

    public User(int id, String firstName, String cin, String email, String password) {
        this.id = id;
        this.firstName = firstName;
        this.cin = cin;
        this.email = email;
        this.password = password;
    }

    public User(String cin, String password) {
        this.cin = cin;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", cin='" + cin + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", roles='" + roles + '\'' +
                ", address='" + address + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
