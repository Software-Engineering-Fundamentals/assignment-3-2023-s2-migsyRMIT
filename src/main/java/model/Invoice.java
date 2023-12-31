import java.util.*;

public class Invoice {
    private String invoiceID;
    private String userId;
    private int priceCents;
    private String paymentStatus;
    private Date dateCreated;
    private Date datePaid;

    public Invoice(String invoiceID, String userId, int priceCents, String paymentStatus, Date dateCreated,
            Date datePaid) {
        this.invoiceID = invoiceID;
        this.userId = userId;
        this.priceCents = priceCents;
        this.paymentStatus = paymentStatus;
        this.dateCreated = dateCreated;
        this.datePaid = datePaid;
    }

    public boolean payInvoice() {
        // change status to paid and add date paid
        this.paymentStatus = "PAID";
        this.datePaid = new Date();
        return true;
    }

    public boolean verifyPaymentDetails() {
        // If status is paid then payment is verified
        if (this.paymentStatus == "PAID") {
            return true;
        }
        return false;
    }
}
