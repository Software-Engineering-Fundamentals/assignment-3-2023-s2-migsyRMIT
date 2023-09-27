import java.util.*;

public class Main {    
    public static void main(String[] args) {
        // Create instructor object
        Instructor instructor = new Instructor("12345", "instructor@SEF.com", "password", "John", "Appleseed", "1 Second Street", "0412 345 678");

        // Create inquiry arraylist
        ArrayList<Integer> InquiryList = new ArrayList<Integer>();

        // Generate inquiry made by the instructor
        int inquiryID = InquiryList.size() + 1;
        Date dateMade = new Date();
        String sender = instructor.getFirstName(); + " " + instructor.getLastName();
        String status = "pending";
        String question = "What is the company's name?";

        InquiryList.add(inquiryID);
    }
}