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
        this.paymentStatus = "PAID";
        this.datePaid = new Date();
        return true;
    }

}
