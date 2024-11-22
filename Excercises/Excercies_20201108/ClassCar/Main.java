package Excercises.Excercies_20201108.ClassCar;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        Car car;
        while (test -- > 0){
            String [] carInfo = sc.nextLine().split("\\s+");
            if (carInfo[0].equals("CC")){
                car = new ClassicCar(Double.parseDouble(carInfo[1]), Integer.parseInt(carInfo[2]));
                car.calculateSalePrice();
                System.out.println(car);
            } else {
                car = new SportCar(Double.parseDouble(carInfo[1]), Integer.parseInt(carInfo[2]));
                car.calculateSalePrice();
                System.out.println(car);
            }
        }
        Car.maxPrice();
    }
}
abstract class Car{
    protected double price;
    protected int year;
    public static double maxPrice = 0;

    public Car(double price, int year){
        this.price = price;
        this.year = year;
    }
    public abstract double calculateSalePrice();

    @Override
    public String toString(){
        DecimalFormat df = new DecimalFormat("#,###,###.00");
        return "Price: " + df.format(price) + " VND | Year: " + year;
    }
    public static void maxPrice (){
        DecimalFormat df = new DecimalFormat("#,###,###.00");
        System.out.println("Most Expensive: " + df.format(maxPrice) + " VND");
    }

}
class ClassicCar extends Car {
    public ClassicCar(double price, int year){
        super(price, year);
    }
    @Override
    public double calculateSalePrice(){
        price = price * 1.12  + 20000000;
        if(price > maxPrice){
            maxPrice = price;
        }
        return price;
    }
}
class SportCar extends Car {
    public SportCar(double price, int year){
        super(price, year);
    }
    @Override
    public double calculateSalePrice(){
        if (year > 2018){
            price = price * 0.8;
        } else if (year > 2010) {
            price = price * 0.5;
        } else {
            price = price * 0.1;
        }
        if(price > maxPrice){
            maxPrice = price;
        }
        return price;
    }
}


