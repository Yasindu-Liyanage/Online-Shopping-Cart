public class Product {
    private final String id;
    private String name;
    private int remaining_quantity;
    private float price;
    
    public Product(String id, String name, float price, int quantity){
        this.id = id;
        this.name = name;
        this.price = price;
        this.remaining_quantity = quantity;
        
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getRemainingQuantity() {
        return remaining_quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setRemainingQuantity(int remaining_quantity) {
        this.remaining_quantity = remaining_quantity;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
    
    
}
