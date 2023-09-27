import java.util.*;

public class Main {    
    public static void main(String[] args) {
        // Create instructor object
        Instructor instructor = new Instructor("12345", "instructor@SEF.com", "password", "John", "Appleseed", "1 Second Street", "0412 345 678");

        // Create Manager object
        Manager manager = new Manager("67890", "manager@SEF.com", "password123", "Bob", "Jones", "2 Third Avenue", "0498 765 432");

        // Create inquiry arraylist
        ArrayList<Inquiry> InquiryList = new ArrayList<Inquiry>();

        // Generate inquiry made by the instructor and append to arraylist
        int inquiryID = InquiryList.size() + 1;
        Date dateMade = new Date();
        String sender = instructor.getFirstName() + " " + instructor.getLastName();
        String status = "PENDING";
        String question = "What is the learning platform called?";
        String response = "";

        Inquiry inquiry = new Inquiry(inquiryID, dateMade, sender, status, question, response);
        InquiryList.add(inquiry);

        // Manager responds to instructor's inquiry
        manager.trackInquiry(inquiry); // Manager tracks inquiry by its ID
        response = "The learning platform is called 'IT Ed Serves'.";
        manager.setResponse(response);
        manager.updateInquiryStatus();

        // Inquiry is updated to COMPLETE
        inquiry.updateStatus(manager.getInquiryStatus());
    }
}