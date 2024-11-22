package BASIC007_Nam_nhuan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        while (test -- >0){
            int n = Integer.parseInt(sc.nextLine());
            Main main = new Main();
            System.out.print(n +" : ");
            if (main.check(n)){
                System.out.print("Leap-year");
            }
            else {
                System.out.print("Non Leap-year");
            }
            System.out.println();
        }
        
    }
    public boolean check (int n){
        if (n % 400 ==0 || ((n % 4 == 0) && (n % 100 !=0))){
            return true;
        }
        else return false;
    }
    
}
