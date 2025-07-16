import java.util.HashMap;



public class ShoppingCart {
    
    private final String id;
    private int no_of_items = 0;
    private int total_price = 0;
    private HashMap<String, String> cartList = new HashMap<String, String>();
    
    public ShoppingCart(String id){
        this.id = id;
    }
    
    public void addItem(int number){
        no_of_items+=number;
    }
    
    public void removeItem(int number){
        no_of_items-=number;
    }

    public String getId() {
        return id;
    }

    public int getNoOfItems() {
        return no_of_items;
    }

    public int getTotalPrice() {
        return total_price;
    }

    public void addToCartList(String food_id, String quantity, float price) {
        this.cartList.put(food_id,quantity);
        addItem(Integer.parseInt(quantity));
        total_price+=price*Integer.parseInt(quantity);
    }
    
    public void removeFromCartList(String food_id, String quantity, float price) {
        this.cartList.remove(food_id);
        removeItem(Integer.parseInt(quantity));
        total_price-=price*Integer.parseInt(quantity);
    }

    public HashMap<String, String> getCartList() {
        return cartList;
    }
    
    public String getItemQuantity(String item){
        return cartList.get(item);  
    }
  
}
