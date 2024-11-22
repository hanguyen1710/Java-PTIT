package Excercises.Excercises_20241102.bai_6;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for (int i=0; i<n; i++){
            a.add(sc.nextInt());
        }
        for (int i=0; i<n-1; i++){
            for (int j = i+1 ; j<n; j++){
                if (a.get(i) > a.get(j)){
                    int temp = a.get(i);
                    a.set(i, a.get(j));
                    a.set(j, temp);
                }
            }
        }
        for (int i=0; i< n-1; i++){
            if(a.get(i) == a.get(i+1)){
                a.remove(i);
                i--;
                n--;
            }
        }
        System.out.println(a.size());
    }
}
