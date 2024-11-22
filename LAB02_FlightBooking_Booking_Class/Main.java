package LAB02_FlightBooking_Booking_Class;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = Integer.parseInt(scanner.nextLine());
        while (test -- >0 ){
            String [] arr = scanner.nextLine().split("\\s+");
            FlightBooking fb = new FlightBooking();
            FlightBooking.setSeatAvailable();
            for (int i=0; i< arr.length-1; i+=2){
                if (arr[i+1].equals("Booking")){
                    System.out.print("[Seat Available: "+ fb.booking()+"]");
                }
                else if (arr[i+1].equals("Confirmed")){
                    System.out.print("--User "+ arr[i]+" Confirmed--[Seat Available: "+ fb.confirm()+ "]");
                }
                else {
                    System.out.print("[Seat Available: "+ fb.cancel()+"]");
                }
            }
            System.out.println();
        }

    }
}
class FlightBooking{
    public String fightId = "OOP24";
    private  static int seatAvailable = 180;

    public static void setSeatAvailable() {
        FlightBooking.seatAvailable = 180;
    }

    public int  booking (){
        return seatAvailable-=1;
    }
    public int  confirm(){
        return seatAvailable;
    }
    public  int cancel(){
        return seatAvailable +=1;
    }
}
