public class Order {
    private final String order_id;
    private final String order_owners_id;
    private float order_price;
    private boolean is_delivered_to_delivery_service;
    private boolean is_delivered_to_customer;
    private boolean is_accepted;
    private boolean is_rejected;
    
    
    public Order(String order_id, String order_owners_id , float order_price, boolean is_delivered_to_delivery_service, boolean is_delivered_to_customer, boolean is_accepted){
        this.order_id = order_id;
        this.order_owners_id = order_owners_id ;
        this.order_price = order_price;
        
        
    }
    public void acceptOrder(){
        is_accepted = true;
        is_rejected = false;
    }
    
    public void rejectOrder(){
        is_rejected = true;
        is_accepted = false;
    }
    
    public void trackOrder(){
        if(is_delivered_to_customer = true){
            System.out.println("Order completed.");
        }
        else if(is_delivered_to_delivery_service = true){
            System.out.println("Your order is handed over to the delivery service. You'll receive it soon.");    
        }else if(is_accepted = true){
            System.out.println("Your order is stil packing. We'll deliver it to you as soon as possible.");
        }else if(is_rejected = true) {
            System.out.println("Your order is cancelled. Contact +94714567894 for more inormation.");
        }else
        {
            System.out.println("You have not placed any orders yet.");
        }
    }

    public String getOrderId() {
        return order_id;
    }

    public String getOrderOwnersId() {
        return order_owners_id;
    }

    public float getOrderPrice() {
        return order_price;
    }

    public boolean isIsDeliveredToDeliveryService() {
        return is_delivered_to_delivery_service;
    }

    public boolean isIsDeliveredToCustomer() {
        return is_delivered_to_customer;
    }

    public boolean isIsAccepted() {
        return is_accepted;
    }

    public boolean isIsRejected() {
        return is_rejected;
    }

    public void setOrderPrice(float order_price) {
        this.order_price = order_price;
    }

    public void setIsDeliveredToDeliveryService(boolean is_delivered_to_delivery_service) {
        this.is_delivered_to_delivery_service = is_delivered_to_delivery_service;
    }

    public void setIsSeliveredDoCustomer(boolean is_delivered_to_customer) {
        this.is_delivered_to_customer = is_delivered_to_customer;
    }

    public void setIsAccepted(boolean is_accepted) {
        this.is_accepted = is_accepted;
    }

    public void setIsRejected(boolean is_rejected) {
        this.is_rejected = is_rejected;
    }
    
    
    
}
