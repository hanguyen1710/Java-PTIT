package OOP009_Slope_Point;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = Integer.parseInt((scanner.nextLine()));
        while (test -- >0){
            String [] nums = scanner.nextLine().split("\\s+");
            Point point1 = new Point(Integer.parseInt(nums[0]), Integer.parseInt(nums[1]));
            Point point2 = new Point(Integer.parseInt(nums[2]), Integer.parseInt(nums[3]));
            System.out.println(point1.slope(point2));

        }
    }
}
class Point {
    private int x,y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public double slope(Point other){
        double deltaX = other.x - this.x;
        double deltaY = other.y - this.y;
        if (deltaX == 0.0){
            return -1.0;
        }
        else {
            if(deltaY == 0.0){
                return 0.0;
            }
            return deltaY / deltaX;
        }
    }
}
