package Excercises.Sample_20241102.bai_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = a-1; i >= 1; i--){
            if (a % i == 0){
                System.out.println(i);
                break;
            }
        }
        int i = a;
        while (i-- >= 1){
            if(a % i == 0){
                System.out.println(i);
                break;
            }
        }
        int j = a-1;
        do {
            if(a % j == 0){
                System.out.println(j);
                break;
            }
        } while(j-- >= 1);
    }
}
