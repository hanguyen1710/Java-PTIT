package Excercises.Excercises_20241102.bai_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        int result [] = new int[n];
        for (int i=0; i<n;i++){
            a[i] = sc.nextInt();
        }
        for (int i=0; i<n; i++){
            b[i] = sc.nextInt();
        }
        for (int i=0; i<n; i++){
            result[i] = a[i]*b[i];
        }
        for(int num : result){
            System.out.print(num +" ");
        }
    }
}
