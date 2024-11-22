package OOP005_Hinh_dang_va_dien_tich;
import java.lang.Math;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = Integer.parseInt(scanner.nextLine());
        while (test -- > 0){
            String [] s = scanner.nextLine().split(("\\s+"));
            if(s[0].equals("Rectangle")){
                Rectangle rectangle = new Rectangle(s[0], Double.parseDouble(s[1]), Double.parseDouble(s[2]));
                rectangle.displayInfo();
            }
            else {
                Circle circle = new Circle(s[0], Double.parseDouble(s[1]));
                circle.displayInfo();
            }
        }
    }
    
}
abstract class Shape {
    protected String name;
    public Shape (String name){
        this.name = name;
    }
    public abstract double calculateArea();
    public void displayInfo(){
        System.out.println("Shape:" + name + "|Area:" + String.format("%.2f",calculateArea()));
    }
}
class Rectangle extends Shape{
    private double width, length;

    public Rectangle(String name, double width, double length) {
        super(name);
        this.width = width;
        this.length = length;
    }
    public double calculateArea(){
        return length*width;
    }
}
class Circle extends Shape{
    private double radius;
    public Circle (String name, double radius){
        super (name);
        this.radius = radius;
    }
    public double calculateArea(){
        return Math.PI * radius *radius;
    }
}