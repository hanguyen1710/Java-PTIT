package Excercises.Excercises_20241102.bai_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int check[] = new int[n];
        for (int i=0; i<n; i++){
            a[i] = sc.nextInt();
            check[i] = 1;
        }
        for(int i=0; i<n; i++){
            for (int j=i+1; j<n;j++){
                if (a[i] == a[j]){
                    check[i] =0;
                    check[j] = 0;
                }
            }
        }
        for (int i=0; i<n; i++){
            if (check[i] == 1){
                System.out.print(a[i] + " ");
            }
        }
    }
}
