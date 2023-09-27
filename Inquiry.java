import java.util.*;

public class Inquiry {
    private int inquiryID;
    private Date dateMade;
    private String sender;
    private String status;
    private String question;

    public Inquiry(int inquiryID, Date dateMade, String sender, String status, String question) {
        this.inquiryID = inquiryID;
        this.dateMade = dateMade;
        this.sender = sender;
        this.status = status;
        this.question = question;
    }
}