public class Customer {
    
    private final String id;
    private String name;
    private String contact_number;
    private String email;
    private String delivery_address;
    private float bonus_points;
    private String cart_id;
    
    public Customer(String id, String name,String email, String contact_number, String delivery_address, String cart_id){
        bonus_points = 10;
        this.contact_number = contact_number;
        this.delivery_address = delivery_address;
        this.email = email;
        this.id = id;
        this.name = name;
        this.cart_id = cart_id;
    }
    
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getContactNumber() {
        return contact_number;
    }

    public String getEmail() {
        return email;
    }

    public String getDeliveryAddress() {
        return delivery_address;
    }

    public float getBonusPoints() {
        return bonus_points;
    }

    public void setContactNumber(String contact_number) {
        this.contact_number = contact_number;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDeliveryAddress(String delivery_address) {
        this.delivery_address = delivery_address;
    }

    public void setBonusPoints(int bonus_points) {
        this.bonus_points = bonus_points;
    }
    
    public void searchProduct(){
        
    }
    
    public void addProductToCart(){
        
    }
    
    public void removeProduct(){
        
    }
    
    public void makePayment(){
        
    }
    
    
    
    
    
    
}
