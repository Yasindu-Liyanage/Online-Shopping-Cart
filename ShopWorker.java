public class ShopWorker {
    
    private final String id;
    private String name;
    private String email;
    private String position;
    private int age;
    private int salary;
    boolean order_received = false;
    boolean order_completed = false;
    boolean order_packed = false;
    boolean order_handover = false;
    
    public ShopWorker(String id, String name, String email, String position,int age){
        this.id = id;
        this.email = email;
        this.age = age;
        this.position = position;
        this.name = name;
    }
    
    public void print_details(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(email);
        System.out.println(age);
        System.out.println(position);
        System.out.println(salary);
    }
    
    public int getSalary(){
        return salary;
    }
    
    public void setSalary(int new_salary){
        salary = new_salary;
    }
    
    public String getPosition(){
        return position;
    }
    
    public void setPosition(String new_position){
        position = new_position;
    }
    
    public void receiveOrder(){
        System.out.println("Order received.");
        order_received = true;
    }
    
    public void packOrder(){
        System.out.println("Order packed.");
        order_packed = true;
    }
    
    public void handOverToDeliveryService(){
        System.out.println("Order is handed over to delivery company");
        order_handover = true;
    }
    
    
  
    
}
