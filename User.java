public class User {
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private String address;
    private String phoneNumber;

    public User(String employeeId, String email, String password, String firstName, String lastName,
            String address, String phoneNumber) {
        this.employeeId = employeeId;
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        // PUT SHARED ATTRIBUTES OF EMPLOYEE IN SUPER
    }

}
