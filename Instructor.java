import java.util.*;

public class Instructor extends Employee {

    public Instructor(String employeeId, String email, String password, String firstName, String lastName,
            String address, String phoneNumber) {
        // PUT SHARED ATTRIBUTES OF EMPLOYEE IN SUPER
        super(employeeId, email, password, firstName, lastName, address, phoneNumber);
    }

    public Invoice generateRegInvoice(Course course) {
        // create Date created for new invoice
        Date dateCreated = new Date();
        Instructor coordId = course.getCoordinator();
        // create invoice for registration
        // Invoice has not been paid so payment status = Unpaid
        // And datePaid is null
        Invoice regInvoice = new Invoice("0001", coordId.getEmployeeID(), 5000, "UNPAID", dateCreated, null);
        return regInvoice;
    }
}