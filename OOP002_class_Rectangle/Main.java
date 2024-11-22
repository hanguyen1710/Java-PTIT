package OOP002_class_Rectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test= Integer.parseInt(sc.nextLine());
        while (test -- >0){
            String [] arr = sc.nextLine().split("\\s+");
            Rectangle rectangle = new Rectangle(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]), Integer.parseInt(arr[2]), Integer.parseInt(arr[3]));
            System.out.println(rectangle);
        }
    }
}
class Rectangle {
    private int x,y,width, height;

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
    public String toString (){
        return "Rectangle[x="+ x+ ",y="+ y+ ",width="+ width + ",height=" +height +"]";
    }
}