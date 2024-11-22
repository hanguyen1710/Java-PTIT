package Excercises.Excercises_20241109.Kiem_tra_xem_chuoi_co_bang_chuoi_khac_hay_khong;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        while (test -- >0){
            String s1 = sc.nextLine().toLowerCase();
            String s2 = sc.nextLine().toLowerCase();
            if (s1.equals(s2)) System.out.println("true");
            else System.out.println("false");
        }
    }
}
