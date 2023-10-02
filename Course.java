import java.util.*;

public class Course {
    private String courseId;
    private String courseName;
    private String category;
    private int lengthWeeks;
    private Date censusDate;
    private Instructor coordinater;
    private ArrayList<Instructor> courseInstructorList;
    private boolean courseStatus;

    public Course(String courseId, String courseName, String category, int lengthWeeks,
            Date censusDate, Instructor coordinater, ArrayList<Instructor> courseInstructorList, boolean courseStatus) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.category = category;
        this.lengthWeeks = lengthWeeks;
        this.censusDate = censusDate;
        this.coordinater = coordinater;
        this.courseInstructorList = courseInstructorList;
        this.courseStatus = courseStatus;
    }

    public boolean updateCourseStatus(boolean paymentStatus) {
        return paymentStatus;
    }

    public Instructor getCoordinator() {
        return this.coordinater;
    }
}