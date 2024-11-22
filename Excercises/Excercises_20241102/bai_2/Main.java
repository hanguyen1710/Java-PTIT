package Excercises.Excercises_20241102.bai_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        for (int i=0; i<n-1; i++){
            for (int j = i+1 ; j<n; j++){
                if (a[i] > a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println(a[n-2]);
    }
}
