package STRING002_Kiem_tra_xem_chuoi_co_chua_chuoi_khac_hay_khong;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = Integer.parseInt(scanner.nextLine());
        while (test -- >0){
            String s1 = scanner.nextLine();
            String s2 = scanner.nextLine();
            Main main = new Main();
            System.out.println(main.check(s1, s2));
        }
    }
    public boolean check (String s1, String s2){
        String [] arr = s1.split("\\s+");
        for (int i=0; i<arr.length; i++){
            if(s2.equals(arr[i])){
                return true;
            }
        }
        return false;
    }
}
