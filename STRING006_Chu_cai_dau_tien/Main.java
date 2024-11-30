package STRING006_Chu_cai_dau_tien;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        while(test -- > 0){
            char [] sentense  = sc.nextLine().toCharArray();
            StringBuilder sb = new StringBuilder();
            for (char word : sentense){
                if(Character.isUpperCase(word)){
                    sb.append(word);
                }
            }
            System.out.println("My initials are: " + sb.toString());
        }
    }
}
