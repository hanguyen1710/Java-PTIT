package STRING001_Tim_chu_cai_o_vi_tri_index_nhat_dinh;

import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        int test = Integer.parseInt(scanner.nextLine());
        while (test -- >0){
            String []s = scanner.nextLine().split("\\s+");
            for (int i=0; i< s[0].length(); i++){
                if (i == Integer.parseInt(s[1])){
                    System.out.println("The character at position "+ i + " is "+ s[0].charAt(i));
                }
            }
        }
    }
}
