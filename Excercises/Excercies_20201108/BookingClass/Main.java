package Excercises.Excercies_20201108.BookingClass;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        while (test -- >0){
            FlightBooking flightBooking = new FlightBooking();
            String bookingInfo = sc.nextLine();
            String result = "";
            String [] userID = bookingInfo.split("\\D+");
            String [] action = bookingInfo.split("\\d+");
            for (int i=0; i<userID.length; i++){
                if(action[i+1].trim().equals("Booking")){
                    result += "[Seat Available: " + flightBooking.bookingSeat() + "]";
                } else if (action[i+1].trim().equals("Cancel")){
                    result += "[Seat Available: " +  flightBooking.cancelSeat() + "]";
                }
                else{
                    result += "--User " + userID[i]+ " Confirmed--" + "[Seat Available: " + FlightBooking.seatAvailable + "]";
                }
            }
            System.out.println(result);
        }
    }
}
class FlightBooking{
    public String flightId="OOP24";
    static int seatAvailable=180;

    public FlightBooking(){
        seatAvailable =180;
    }

    public int bookingSeat (){
        return seatAvailable = seatAvailable - 1;

    }
    public int cancelSeat (){
        return seatAvailable = seatAvailable + 1;

    }

}
