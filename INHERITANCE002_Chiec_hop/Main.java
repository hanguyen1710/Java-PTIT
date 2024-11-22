package INHERITANCE002_Chiec_hop;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BoxWithMaxWeight boxWithMaxWeight = new BoxWithMaxWeight(10);
        Item item1 = new Item("Saludo", 5);
        Item item2 = new Item("Pirkka", 5);
        Item item3 = new Item("Kopi Luwak", 5);
        boxWithMaxWeight.add(item1);
        boxWithMaxWeight.add(item2);
        boxWithMaxWeight.add(item3);
        System.out.println(boxWithMaxWeight.isInBox(item1));
        System.out.println(boxWithMaxWeight.isInBox(item2));
        System.out.println(boxWithMaxWeight.isInBox(item3));
    }
}

class Item {
    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Item(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }
}

abstract class Box {
    public abstract void add(Item item);

    public abstract boolean isInBox(Item item);
}

class BoxWithMaxWeight extends Box {
    private ArrayList<Item> items;
    private int maxWeight;

    public BoxWithMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
        items = new ArrayList<>();
    }

    public void add(Item item) {
        if (item.getWeight() <= maxWeight) {
            maxWeight -= item.getWeight();
            items.add(item);
        }
    }

    public boolean isInBox(Item item) {
        for (Item item2 : items) {
            if (item2.getName().equals(item.getName())) {
                return true;
            }
        }
        return false;
    }

}