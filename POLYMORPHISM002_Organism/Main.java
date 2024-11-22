package POLYMORPHISM002_Organism;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = Integer.parseInt(scanner.nextLine());
        while (test -- >0){
            String [] s = scanner.nextLine().split("\\s+");
            Organism organism = new Organism(Integer.parseInt(s[0]), Integer.parseInt(s[1]));
            Herd herd = new Herd();
            herd.addtoHerd(organism);
            herd.move(1, 1);
            System.out.print(herd); 
        }
    }
}

interface Moveable {
    public void move(int dx, int dy);
}

class Organism implements Moveable {
    private int x, y;

    public Organism(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public String toString() {
        return "x:" + x + ";y:" + y;
    }
}

class Herd {
    private ArrayList<Organism> organisms;

    public Herd() {
        organisms = new ArrayList<>();
    }

    public String toString() {
        String res = "";
        for (Organism organism : organisms) {
            res += organism.toString() + "\n";
        }
        return res;
    }

    public void addtoHerd(Moveable moveable) {
        Organism organism = (Organism) moveable;
        organisms.add(organism);
    }
    public void move(int dx, int dy){
        for (Organism organism: organisms){
            organism.move(dx, dy);
        }
    }
}