package BASIC009_Tinh_goc_phan_tu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = Integer.parseInt(scanner.nextLine());
        while (test -- >0){
            String [] s = scanner.nextLine().split("\\s+");
            Main main = new Main();
            System.out.println(main.quadrant(Integer.parseInt(s[0]), Integer.parseInt(s[1])));
        }
        
    }
    public int quadrant (int x, int y){
        if (x==0 || y == 0){
            return 0;
        }
        else {
            if(x>0 && y > 0){
                return 1;
            }
            else if (x<0 && y >0){
                return 2;
            }
            else if (x < 0 && y <0){
                return 3;
            }
            else return 4;
        }
    }
}
