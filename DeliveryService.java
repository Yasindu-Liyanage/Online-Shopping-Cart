public class DeliveryService {
    
    private final String id;
    private String name;
    boolean order_accept = false;
    boolean order_delivered = false;
    
    public DeliveryService(String id, String name){
        this.id = id;
        this.name = name;
    }
    
    public void getOrder(){
        order_accept = true;
    }
    
    public void deliverOrder(){
        order_delivered = true;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    
}
