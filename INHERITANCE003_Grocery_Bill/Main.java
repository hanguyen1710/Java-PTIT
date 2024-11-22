package INHERITANCE003_Grocery_Bill;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Grocery Bill");
        GroceryBill groceryBill = new GroceryBill(employee);
        Item item1 = new Item("item 1", 2.3, 0.0);
        Item item2 = new Item("item 2", 3.45, 0.0);
        groceryBill.add(item1);
        groceryBill.add(item2);
        System.out.println(groceryBill);
        System.out.println();
        Item item3 = new Item("item 3", 20, 15);
        Item item4 = new Item("item 4", 40, 35);
        Item item5 = new Item("item 5", 50, 35);
        Employee employee1 = new Employee("Discount Bill");
        DiscountBill discountBill = new DiscountBill(employee1);
        discountBill.add(item3);
        discountBill.add(item4);
        discountBill.add(item5);
        System.out.println(discountBill);

    }
}

class Item{
    private String name;
    private double price,discount;

    public Item(String name, double price, double discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscount() {
        return discount;
    }
    public String toString (){
        return name + " $"+ String.format("%.2f",price)+" (-$"+String.format("%.2f", discount)+")";
    }
}
class Employee{
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
class GroceryBill {
    private Employee clerk;
    private ArrayList<Item> receipt;
    private double total;

    public GroceryBill(Employee clerk) {
        this.clerk = clerk;
        receipt = new ArrayList<>();
    }

    public void add(Item item){
        receipt.add(item);
        total += item.getPrice();
    }
    public Employee getClerk() {
        return clerk;
    }

    public double getTotal() {
        return total;
    }

    public ArrayList<Item> getReceipt() {
        return receipt;
    }

    public String toString (){
        String res="";
        res += "items:" + "\n";
        for (Item item:receipt){
            res += "   " + item.toString() +"\n";
        }
        res += "total: $" + String.format("%.2f", total) +"\n";
        res+= "Clerk: " + clerk.getName();
        return res;
    }
}
class DiscountBill extends GroceryBill{
    private double discountAmount;
    public DiscountBill (Employee clerk){
        super(clerk);
    }
    public void add(Item item){
        super.add(item);
        discountAmount += item.getDiscount();
    }
    public String toString (){
        String res="";
        res += "items:" + "\n";
        for (Item item:super.getReceipt()){
            res += "   " + item.toString() +"\n";
        }
        res+= "sub-total: $" + String.format("%.2f", super.getTotal())+"\n";
        res+= "discount: $" + String.format("%.2f", discountAmount)+"\n";
        res += "total: $" + String.format("%.2f", super.getTotal()-discountAmount) +"\n";
        res+= "Clerk: " + super.getClerk().getName();
        return res;
    }

}