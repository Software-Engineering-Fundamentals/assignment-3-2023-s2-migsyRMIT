public class Employee extends User {
    private String employeeId;

    public Employee(String employeeId, String email, String password, String firstName, String lastName,
            String address, String phoneNumber) {
        // PUT SHARED ATTRIBUTES OF USER IN SUPER
        super(email, password, firstName, lastName, address, phoneNumber);

    }

    public String getEmployeeID() {
        return this.employeeId;
    }

}
