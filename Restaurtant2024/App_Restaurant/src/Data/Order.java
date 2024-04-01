
package Data;


public class Order {
    private String id_customerStr;
    private String det_order;
    private float totalFlt;

    public Order(String id_customerStr, String det_order, float totalFlt) {
        this.id_customerStr = id_customerStr;
        this.det_order = det_order;
        this.totalFlt = totalFlt;
    }

    public String getId_customerStr() {return id_customerStr;}
    public String getDet_order() {return det_order;}
    public float getTotalFlt() {return totalFlt;}
    
   
}
