package BASIC005_Tinh_tong_5_so;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = Integer.parseInt(scanner.nextLine());
        while (test -- >0){
            String s [] = scanner.nextLine().split("\\s+");
            int sum =0;
            for (int i=0; i<s.length; i++){
                sum+= Integer.parseInt(s[i]);
            }
            System.out.println(sum);
        }
    }
}
