package COLLECTION001_Warehouse;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addProduct("milk", 10);
        warehouse.addProduct("coffee", 7);
        System.out.println("prices:");
        System.out.println("milk: "+ warehouse.stock("milk"));
        System.out.println("coffee: "+ warehouse.stock("coffee"));
        System.out.println("sugar: " + warehouse.stock("sugar"));
    }
}
class Warehouse {
    private String product;
    private int stock;
    HashMap<String, Integer> map = new HashMap<>();

    public void addProduct(String product, int stock){
        map.put(product, stock);
    }
    public int stock(String product){
        if (map.containsKey(product)){
            return map.get(product);
        }
        else return -99;
    }
}