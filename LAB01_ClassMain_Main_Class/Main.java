package LAB01_ClassMain_Main_Class;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = Integer.parseInt(scanner.nextLine());
        while (test -- >0 ){
            String s = scanner.nextLine();
            String [] arr = s.split("\\s+");
            System.out.println(s.length() + " " + arr.length);
        }
    }
}
