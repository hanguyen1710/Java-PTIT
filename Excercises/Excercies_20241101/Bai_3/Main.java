package Bai_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt("5");
        int sum=0;
        for (int i = 0; i < n; i++) {
            sum+=Integer.parseInt(sc.nextLine());
        }
        System.out.println(sum);
    }
    
}
