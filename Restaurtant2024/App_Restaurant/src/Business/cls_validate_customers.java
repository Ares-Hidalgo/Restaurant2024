
package Business;

import javax.swing.JOptionPane;

public class cls_validate_customers {
    
    private boolean valBool = false;
    private String msn;
    
    public void ftn_validateInputData(String idStr,
            String nameStr,
            String contactStr, 
            String emailStr){
        if( idStr.equals("")|| nameStr.equals("")||
                contactStr.equals("")|| emailStr.equals("")){
            this.msn = "You must enter all the data!!";
        }else{
            this.valBool = true;
            this.msn = "Customer ["+ nameStr +"] has been successfully registered";
        }
    }
    public String getMsn(){return this.msn;}
    public boolean getVal(){return this.valBool;} 
}
