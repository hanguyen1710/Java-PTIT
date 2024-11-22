package BASIC012_So_luong_cac_chu_so_tang_dan_lon_nhat_trong_day;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = Integer.parseInt(scanner.nextLine());
        while (test -- >0){
            String [] arr = scanner.nextLine().split("\\s+");
            int [] array = new int [arr.length];
            for (int i=0; i<arr.length; i++){
                array[i] = Integer.parseInt(arr[i]);
            } 
            Main main = new Main();
            System.out.println(main.longestSortedSequence(array));
        }
        
    }
   public int longestSortedSequence(int[] a){
    int max = 1;
    int count = 1;
    for (int i=1; i < a.length; i++){
        if (a[i] >= a[i-1]){
            count++;
            if(count > max){
                max = count;
            }
        }
        else {
            count =1;
        }
    }
    return max;
   }
}
