package Excercises.Excercies_20201108.ClassUtilt;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Utils.u(sc.nextLine());
    }
}
class Utils {
    public static void u(String s) {
        try {
            System.out.println(s);
            z(s);
            try {
                System.out.println(Integer.parseInt(s)+1);
            } catch (NumberFormatException e) {
                System.out.println(s.toUpperCase());
            }
        } catch (ClassNotFoundException e) {
            System.out.println(1);
        }
    }

    public static void  z(String s) throws ClassNotFoundException{
        System.out.println(2);
        if (s.length() == 1)
            throw new ClassNotFoundException();
        System.out.println(3);
    }
}