package LAB02_On_class_Session08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String t = sc.nextLine();
        String s = sc.nextLine();
        String [] arr = s.split("\\s+");
        StringBuilder sb = new StringBuilder(arr[2]);
        sb.delete(0,1);
        sb.delete(sb.length() -1, sb.length());
        String s1 = sb.toString();
        if (s1.equals(t)){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }

}
