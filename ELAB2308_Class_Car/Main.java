package ELAB2308_Class_Car;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        while (test -- > 0){
            String s[] = sc.nextLine().split("\\s+");
            Car car;
            if(s[0].equals("SC")){
                car = new SportCar(Double.parseDouble(s[1]), Integer.parseInt(s[2]));
            }
            else {
                car = new ClassicCar(Double.parseDouble(s[1]), Integer.parseInt(s[2]));
            }
            System.out.println(car);
        }
        DecimalFormat df = new DecimalFormat("##,###,###.00");
        System.out.println("Most Expensive: "+ df.format(Car.maxPrice)+ " VND");
    }
}
abstract class Car {
    protected double price;
    protected int year;
    static double maxPrice;
    public Car (double price, int year) {
        this.price = price;
        this.year = year;
    }
    public abstract double calculateSalePrice();
    public String toString(){
        DecimalFormat df = new DecimalFormat("##,###,###.00");
        return "Price: " + df.format(calculateSalePrice())+" VND | Year: "+year;
    }
}
class SportCar extends Car{
    public SportCar (double price, int year){
        super(price, year);
    }
    public double calculateSalePrice(){
        if(year > 2018){
            price = price * 0.8;
        }
        else if(year > 2010){
            price = price * 0.5;
        }
        else {
            price = price * 0.1;
        }
        if(price > maxPrice){
            maxPrice = price;
        }
        return price;
    }
}
class ClassicCar extends Car{
    public ClassicCar (double price, int year){
        super(price, year);
    }
    public double calculateSalePrice(){
        price = price * 1.12 + 20000000;
        if(price > maxPrice ){
            maxPrice = price;
        }

    return price;
    }
}