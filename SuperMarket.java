import java.util.HashMap;
import java.util.Scanner;


public class SuperMarket {
    
    
    public static void main(String[] args){
        HashMap<String, String> cartList = new HashMap<String, String>();
        
        ShopWorker saman = new ShopWorker("W0001", "Saman", "samanml@gmail.com", "Worker", 26);
        
        Customer nalin = new Customer("C000001", "Nalin Weththasinghe", "nalinw@gmail.com", "0778682395", "23/218,Albert singh road, Hakmana,Matara.", "C0001");
        
        ShoppingCart nalincart = new ShoppingCart("C0001");
        ShoppingCart ranilcart = new ShoppingCart("C0002");
        
        Product SMH0001 = new Product("SHM0001","Vegitable bun", 90, 20);
        Product SMH0002 = new Product("SHM0002","fish bun", 130, 40);
        Product VEG0001 = new Product("VEG0001","Carrot/100g",53,3000);
        Product VEG0002 = new Product("VEG0002","Beans/100g",70,4000);
        Product FRU0001 = new Product("FRU0001","Pineapple/100g",120,2000);
        Product FRU0002 = new Product("FRU0002","Banana/100g",53,4000);
        Product DES0001 = new Product("DES0001","Elephant house chocolate ice cream/1l",53,200);
        Product DES0002 = new Product("DES0002","Highland yoghurt/80g",70,2000);
        Product CAB0001 = new Product("CAB0001","Kandos choconuts/115g",290,2000);
        Product CAB0002 = new Product("CAB0002","Munchee chocolate wafers/85g",120,1500);
        DeliveryService courierfast = new DeliveryService("D0001", "Deliver Express Courier service");
        Order nalinorder = new Order("C0001", "C000001", 0, false, false, false);
        int repeat = 1; // to repeat the process
         
        while(repeat == 1){

            /*
            enter 1 for add an item to the cart
            enter 2 to remove an item from cart
            enter 3 to check the total price of goods in your cart
            enter 4 to check the number of items in the cart
            enter 5 to buy your items into the cart
            enter 6 to view your cart items and quantities
            */
            System.out.println("enter 1 for add an item to the cart\n" +
    "enter 2 to remove an item from cart\n" +
    "enter 3 to check the total price of goods in your cart\n" +
    "enter 4 to check the number of items in the cart\n" +
    "enter 5 to buy your selected items into the cart\n" +
    "enter 6 to view your cart items and quantities"            
            );
            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();
            sc.nextLine();

        
            switch (input) {
                case 1:

                String map_food_id = "INVALID ID";
                float price = 0;
                int addAnotherItem = 1;

                while(addAnotherItem == 1){
                     /*
                    1-2 short meals
                    3-4 vegetables
                    5-6 fruits
                    7-8 desserts
                    9-10 biscuits and chocolate
                    enter 1 for vegibun
                    enter 2 for fishbun
                    enter 3 for Carrot/100g
                    enter 4 for Beans/100g
                    enter 5 for Pineapple/100g
                    enter 6 for Banana/100g
                    enter 7 for Elephant house chocolate icecream
                    enter 8 for Highland Yoghurt
                    enter 9 for Kandos Choconuts/115g
                    enter 10 for Munchee chocolate wafers/85g


                    */
                    System.out.println("What product do you like to add buy. Add them to cart first\n"+
    "                1-2 short meals\n" +
    "                3-4 vegetables\n" +
    "                5-6 fruits\n" +
    "                7-8 desserts\n" +
    "                9-10 biscuits and chocolate\n" +
    "                enter 1 for vegibun\n" +
    "                enter 2 for fishbun\n" +
    "                enter 3 for Carrot/100g\n" +
    "                enter 4 for Beans/100g\n" +
    "                enter 5 for Pineapple/100g\n" +
    "                enter 6 for Banana/100g\n" +
    "                enter 7 for Elephant house chocolate icecream\n" +
    "                enter 8 for Highland Yoghurt\n" +
    "                enter 9 for Kandos Choconuts/115g\n" +
    "                enter 10 for Munchee chocolate wafers/85g");
                    int input2 = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter the quantity you want as products of given scale");
                    String quantity = sc.nextLine();
                    switch(input2){
                        case 1:
                            map_food_id = "SHM0001";
                            price = SMH0001.getPrice();

                            break;
                        case 2:
                             map_food_id = "SHM0002";
                             price = SMH0002.getPrice();

                            break;
                        case 3:
                             map_food_id = "VEG0001";
                             price = VEG0001.getPrice();

                            break;
                        case 4:
                             map_food_id = "VEG0002";
                             price = VEG0002.getPrice();

                            break;
                        case 5:
                             map_food_id = "FRU0001";
                             price = FRU0001.getPrice();

                            break;
                        case 6:
                             map_food_id = "FRU0002";
                             price = FRU0002.getPrice();

                            break;
                        case 7:
                             map_food_id = "DES0001";
                             price = DES0001.getPrice();

                            break;
                        case 8:
                             map_food_id = "DES0002";
                             price = DES0002.getPrice();

                            break;
                        case 9:
                             map_food_id = "CAB0001";
                             price = CAB0001.getPrice();

                            break;
                        case 10:
                             map_food_id = "CAB0002";
                             price = CAB0002.getPrice();

                            break;
                        default:
                            System.out.println("Invalid number is entered for the item you want.");

                    }
                        if(map_food_id != "INVALID ID"){      
                            nalincart.addToCartList(map_food_id,quantity,price);                
                        }
                    System.out.println("Do you want to add another item if yes press 1. If not press 2");
                    addAnotherItem = sc.nextInt();



                }
                    break;


                case 2:
                     System.out.println("What product do you like to add buy. Add them to cart first\n"+
    "                1-2 short meals\n" +
    "                3-4 vegetables\n" +
    "                5-6 fruits\n" +
    "                7-8 desserts\n" +
    "                9-10 biscuits and chocolate\n" +
    "                enter 1 for vegibun\n" +
    "                enter 2 for fishbun\n" +
    "                enter 3 for Carrot/100g\n" +
    "                enter 4 for Beans/100g\n" +
    "                enter 5 for Pineapple/100g\n" +
    "                enter 6 for Banana/100g\n" +
    "                enter 7 for Elephant house chocolate icecream\n" +
    "                enter 8 for Highland Yoghurt\n" +
    "                enter 9 for Kandos Choconuts/115g\n" +
    "                enter 10 for Munchee chocolate wafers/85g");

                map_food_id = "INVALID ID";
                price = 0;
                String removeAnotherItem = "y";

                while(removeAnotherItem == "y"){
                    int input2 = sc.nextInt();
                    String quantity;
                    switch(input2){
                        case 1:
                            map_food_id = "SHM0001";
                                price = SMH0001.getPrice();

                            break;
                        case 2:
                             map_food_id = "SHM0002";
                             price = SMH0002.getPrice();

                            break;
                        case 3:
                             map_food_id = "VEG0001";
                             price = VEG0001.getPrice();

                            break;
                        case 4:
                             map_food_id = "VEG0002";
                             price = VEG0002.getPrice();

                            break;
                        case 5:
                             map_food_id = "FRU0001";
                             price = FRU0001.getPrice();

                            break;
                        case 6:
                             map_food_id = "FRU0002";
                             price = FRU0002.getPrice();

                            break;
                        case 7:
                             map_food_id = "DES0001";
                             price = DES0001.getPrice();

                            break;
                        case 8:
                             map_food_id = "DES0002";
                             price = DES0002.getPrice();

                            break;
                        case 9:
                             map_food_id = "CAB0001";
                             price = CAB0001.getPrice();

                            break;
                        case 10:
                             map_food_id = "CAB0002";
                             price = CAB0002.getPrice();

                            break;
                        default:
                            System.out.println("Invalid number is entered for the item you want.");

                    }
                        quantity = nalincart.getItemQuantity(map_food_id);
                        if(map_food_id != "INVALID ID"){      
                            nalincart.removeFromCartList(map_food_id,quantity,price);                
                        }
                    System.out.println("Do you want to add remove item from cart. If yes press y. If not press n");
                    removeAnotherItem = sc.next();
                }

                    break;
                case 3:
                    float total_price = nalincart.getTotalPrice();
                    System.out.print("Total price of the items in your cart is : ");
                    System.out.println(total_price);
                    break;


                case 4:
                    int no_of_items = nalincart.getNoOfItems();
                    System.out.print("Number of items in your cart is : ");
                    System.out.println(no_of_items);
                    break;


                case 5:
                    total_price = nalincart.getTotalPrice();
                    System.out.print("Total price of the items in your cart is : ");
                    System.out.println(total_price);
                    System.out.println("Pay");
                    float payment = sc.nextInt();
                    if(payment >= total_price){
                        System.out.println("Payment successfull.");
                        nalinorder.acceptOrder();
                    }
                    else{
                        System.out.println("Your payment is less than the total amount.");
                        nalinorder.rejectOrder();
                    }
                    break;
                case 6:
                    cartList = nalincart.getCartList();
                    System.out.println(cartList);
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
                  
                    
            }
            System.out.println("Do you want to continue. If yes enter 1. If no enter 2");
            repeat = sc.nextInt();
        }
        cartList = nalincart.getCartList();
        System.out.println(cartList);
    }
}
