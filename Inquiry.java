import java.util.*;

public class Inquiry {
    public int inquiryID;
    private Date dateMade;
    private String sender;
    private String status;
    private String question;
    private String response;

    public Inquiry(int inquiryID, Date dateMade, String sender, String status, String question, String response) {
        this.inquiryID = inquiryID;
        this.dateMade = dateMade;
        this.sender = sender;
        this.status = status;
        this.question = question;
        this.response = response;
    }

    public int getInquiryID() {
        return this.inquiryID;
    }

    public Date getDateMade() {
        return this.dateMade;
    }

    public String getSender() {
        return this.sender;
    }

    public String getStatus() {
        return this.status;
    }

    public String getQuestion() {
        return this.question;
    }

    public String getResponse() {
        return this.response;
    }

    public void updateResponse(String managerResponse) {
        this.response = managerResponse;
    }

    public void updateStatus(boolean solved) {
        if (solved == true) {
            this.status = "SOLVED";
        } else {
            this.status = "PENDING";
        }
    }

}