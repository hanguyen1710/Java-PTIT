package Excercises.Excercises_20241109.Kiem_tra_xem_chuoi_co_chua_chuoi_khac_hay_khong;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        while(test -- > 0){
            String [] s1 = sc.nextLine().split(" ");
            String s2 = sc.nextLine();
            int check = 0;
            for (String s : s1) {
                if (s.equals(s2.trim())) {
                    System.out.println("true");
                    check =1;
                    break;
                }
            }
            if(check==0) System.out.println("false");
        }
    }
}
