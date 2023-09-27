import java.util.*;

public class Manager extends Employee {
    private String inquiryResponse;
    private boolean solved;

    public Manager(String employeeId, String email, String password, String firstName, String lastName,
            String address, String phoneNumber) {
        // Shared attributes of employee object
        super(employeeId, email, password, firstName, lastName, address, phoneNumber);
    }

    public int trackInquiry(Inquiry inquiry) {
        return inquiry.inquiryID;
    }

    public void setResponse(String inquiryResponse) {
        this.inquiryResponse = inquiryResponse;
    }

    public void updateInquiryStatus() {
        if (this.inquiryResponse.equals(null)) {
            this.solved = false;
        } else {
            this.solved = true;
        }
    }

    public boolean getInquiryStatus() {
        return this.solved;
    }
}
