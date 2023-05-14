import java.util.*;

class Shop {
    static HashMap<String, Integer> base = new HashMap<>();
    static HashMap<String, Integer> toppings = new HashMap<>();
    static HashMap<String, Integer> afters = new HashMap<>();

    Shop() {
        base.put("Regular", 50);
        base.put("Whole wheat", 75);
        toppings.put("Mozzarella cheese", 30);
        toppings.put("Cheddar cheese", 35);
        toppings.put("Spinach", 20);
        toppings.put("Corn", 15);
        toppings.put("Mushrrom", 15);
        toppings.put("Chicken", 50);
        toppings.put("Pepperoni", 45);
        afters.put("Pepsi", 17);
        afters.put("7-up", 19);
        afters.put("Coke", 20);
        afters.put("Lava cake", 95);
        afters.put("Chocolate brownie", 86);

    }
}

public class Main {
    public static void main(String[] args) {
        Shop s = new Shop();
        float totalAmount = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Pizza base: ");
        String baseName = sc.next();
        System.out.println("Sauce: ");
        String sauceName = sc.next();
        System.out.println("Toppings: ");
        String toppinsList = sc.nextLine();
        System.out.println(toppinsList);
        // String toppings[]=toppinsList.split(",",2);
        // for(String topping:toppings){
        //     System.out.println(topping);
        // }
        
    }
}




