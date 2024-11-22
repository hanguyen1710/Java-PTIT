package STRING003_Kiem_tra_chuoi_co_bang_chuoi_khac_hay_khong;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = Integer.parseInt(scanner.nextLine());
        while (test -- >0){
            String s1 = scanner.nextLine().toLowerCase();
            String s2 = scanner.nextLine().toLowerCase();
            if(s1.equals(s2)){
                System.out.println("true");
            }
            else {
                System.out.println("false");
            }
        }
    }
}
