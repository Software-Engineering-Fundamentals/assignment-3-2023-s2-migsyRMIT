import java.util.*;

public class Main {
        public static void main(String[] args) {
                // Create instructor object
                Instructor instructor = new Instructor("12345", "instructor@SEF.com", "password", "John", "Appleseed",
                                "1 Second Street", "0412 345 678");

                // Create Manager object
                Manager manager = new Manager("67890", "manager@SEF.com", "password123", "Bob", "Jones",
                                "2 Third Avenue", "0498 765 432");

                // Create an active inquiry and archived inquiry arraylist
                ArrayList<Inquiry> activeInquiryList = new ArrayList<Inquiry>();
                ArrayList<Inquiry> archivedInquiryList = new ArrayList<Inquiry>();

                // Generate inquiry made by the instructor and append to active inquiry
                // arraylist
                int inquiryID = activeInquiryList.size() + 1;
                Date dateMade = new Date();
                String sender = instructor.getFirstName() + " " + instructor.getLastName();
                String status = "INCOMPLETE";
                String question = "What is the learning platform called?";
                String response = "";

                Inquiry inquiry = new Inquiry(inquiryID, dateMade, sender, status, question, response);
                activeInquiryList.add(inquiry);

                // Manager responds to instructor's inquiry
                manager.trackInquiry(inquiry); // Manager tracks inquiry by its ID
                response = "The learning platform is called 'IT Ed Serves'.";
                manager.setResponse(response);

                // Inquiry is updated to COMPLETE and is moved to the archived inquiry arraylist
                manager.updateInquiryStatus();
                inquiry.updateStatus(manager.getInquiryStatus());
                activeInquiryList.remove(inquiry);
                archivedInquiryList.add(inquiry);

                // Instructor can view the manager's response to the inquiry
                instructor.trackInquiryResponse(inquiry);

                /// Instructor registers for course ///

                // Instructor puts in course details
                String courseId = "ISYS118";
                String courseName = "Software Engineering Fundamentals";
                String category = "Computer Science";
                int lengthWeeks = 12;
                Date censusDate = new Date();
                Instructor coordinater = instructor;
                ArrayList<Instructor> courseInstructorList = new ArrayList<Instructor>();

                // course is initially unavailable needs to be registered
                boolean courseStatus = false;

                // make course object
                Course course = new Course(courseId, courseName, category, lengthWeeks, censusDate, coordinater,
                                courseInstructorList, courseStatus);

                // Generate a invoice to register for course
                Invoice regInvoice = instructor.generateRegInvoice(course);

                // Pay for course registration
                courseStatus = regInvoice.payInvoice();

                // Update course status to true
                course.updateCourseStatus(courseStatus);

        }
}