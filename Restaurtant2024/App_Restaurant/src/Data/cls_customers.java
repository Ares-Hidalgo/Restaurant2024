
package Data;

public class cls_customers {
    private String idStr;
    private String nameStr;
    private String contactStr;
    private String emailStr;
    private int statusInt; // Status [0,1] = [0 : Idle, 1 : Asset]

    public cls_customers(String idStr, String nameStr, String contactStr, String emailStr) {
        this.idStr = idStr;
        this.nameStr = nameStr;
        this.contactStr = contactStr;
        this.emailStr = emailStr;
        this.statusInt = 0;
    }
    
    // Status
    public int getStatusInt() {return statusInt;}
    public void setStatusInt(int statusInt) {this.statusInt = statusInt;}
    
    // Getters
    public String getIdStr() {return idStr;}
    public String getNameStr() {return nameStr;}
    public String getContactStr() {return contactStr;}
    public String getEmailStr() {return emailStr;}
 
   
}
