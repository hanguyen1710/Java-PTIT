package Ngoai_le;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        ArrayList <UsedCar> usedCars = new ArrayList<>();
        while(test -- > 0){
            String [] carInfo = sc.nextLine().split(",");
            try{
                UsedCar usedCar = new UsedCar(carInfo[0].trim(), carInfo[1].trim(), Integer.parseInt(carInfo[2].trim()), Integer.parseInt(carInfo[3].trim()),Double.parseDouble(carInfo[4].trim()));
                usedCars.add(usedCar);
            }
            catch (UsedCarException e){
                System.out.println("Invalid UsedCar: VIN "+e.getMessage());
            }
        }
        System.out.println("List of successfully constructed UsedCar objects:");
        if(usedCars.isEmpty()){
            System.out.println("No used cars");
        }
        else{
            for(UsedCar usedCar : usedCars){
                System.out.println(usedCar);
            }
        }
    }
}
class UsedCarException extends Exception{
    public UsedCarException(String message){
        super(message);
    }
}
class UsedCar {
    private String vin,make;
    private int year;
    private int mileage;
    private double price;

    public UsedCar(String vin, String make, int year, int mileage, double price) throws UsedCarException {
        if (vin.length() != 4 || !vin.matches("\\d+")) {
            throw new UsedCarException(vin);
        }
        if (!make.equals("Ford") && !make.equals("Honda") && !make.equals("Toyota") && !make.equals("Chrysler")) {
            throw new UsedCarException(vin);
        }
        if (year < 1990 || year > 2014) {
            throw new UsedCarException(vin);
        }
        if (mileage < 0) {
            throw new UsedCarException(vin);
        }
        if (price < 0) {
            throw new UsedCarException(vin);
        }

        this.vin = vin;
        this.make = make;
        this.year = year;
        this.mileage = mileage;
        this.price = price;
    }

    @Override
    public String toString(){
        return "UsedCar{vin='"+vin+"', make='"+make+"', year="+year+", mileage="+mileage+", price="+String.format("%.1f", price)+"}";
    }
}
