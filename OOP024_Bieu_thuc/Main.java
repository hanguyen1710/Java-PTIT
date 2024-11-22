package OOP024_Bieu_thuc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = Integer.parseInt(scanner.nextLine());
        while (test -- >0){
            String [] s = scanner.nextLine().split("\\s+");
            int x = Integer.parseInt(s[0]);
            int y= Integer.parseInt(s[1]);
            Main main = new Main();
            System.out.println(main.add(x, y) + " " + main.substract(x, y)+ " " + main.divide(x, y));
        }
    }
    public int add(int x, int y){
        return x+y;
    }
    public int substract (int x, int y){
        return x-y;
    }
    public int divide (int x, int y){
        if(y==0){
            return -1;
        }
        else return x/y;
    }
}
