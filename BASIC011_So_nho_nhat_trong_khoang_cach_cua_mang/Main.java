package BASIC011_So_nho_nhat_trong_khoang_cach_cua_mang;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = Integer.parseInt(scanner.nextLine());
        while (test -- >0 ){
            String [] arr = scanner.nextLine().split("\\s+");
            int [] a = new int[arr.length];
            for (int i=0; i<a.length; i++){
                a[i] = Integer.parseInt(arr[i]);
            }
            Main main = new Main();
            System.out.println(main.minGap(a));
        }
    }
    public int minGap(int [] a){
        int min = 10000000;
        if (a.length < 2){
            return 0;
        }
        else {
            for (int i=0; i< a.length-1 ; i++){
                if ((a[i+1] - a [i]) < min ){
                    min = a[i+1] - a[i];
                }
            }
            return min;
        }
    }
    
}
