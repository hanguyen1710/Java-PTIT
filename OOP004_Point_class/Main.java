package OOP004_Point_class;

import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        while (test -- > 0){
            String [] s = sc.nextLine().split("\\s+");
            Point point1 = new Point(Integer.parseInt(s[0]), Integer.parseInt(s[1]));
            Point point2 = new Point(Integer.parseInt(s[2]), Integer.parseInt(s[3]));
            point1.move(1, 1);
            System.out.println(point1.distanceTo(point2));
        }
    }
}
class Point {
    private int x,y;

    
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public void move(int dx, int dy){
        x += dx;
        y += dy;
    }
    public String distanceTo(Point p){
        int deltaX = p.x - this.x;
        int deltaY = p.y - this.y;
        return String.format("%.2f", Math.sqrt(Math.pow(deltaX, 2) +  Math.pow(deltaY, 2)));
    }
}