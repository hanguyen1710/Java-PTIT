package Excercises.Sample_20241102.bai_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age < 18){
            System.out.println("Thiếu niên");
        } else if (age >= 18 && age < 30) {
            System.out.println("Thanh niên");
        }
        else{
            System.out.println("Trung niên");
        }
    }
}
