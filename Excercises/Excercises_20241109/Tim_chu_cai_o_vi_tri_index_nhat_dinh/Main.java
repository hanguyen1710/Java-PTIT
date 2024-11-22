package Excercises.Excercises_20241109.Tim_chu_cai_o_vi_tri_index_nhat_dinh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        while (test -- > 0){
            String [] strInfo = sc.nextLine().split(" ");
            int index = Integer.parseInt(strInfo[1]);
            System.out.println("The character at position "+ index + " is "+ strInfo[0].charAt(index));
        }
    }
}
