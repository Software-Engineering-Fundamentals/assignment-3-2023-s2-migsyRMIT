public class Instructor extends Employee {

    public Instructor(String employeeId, String email, String password, String firstName, String lastName,
            String address, String phoneNumber) {
        // PUT SHARED ATTRIBUTES OF EMPLOYEE IN SUPER
        super(employeeId, email, password, firstName, lastName, address, phoneNumber);
    }
}