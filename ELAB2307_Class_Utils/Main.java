package ELAB2307_Class_Utils;

import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Utils.u(s);
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

    public static void z(String s) throws ClassNotFoundException{
        System.out.println(2);
        if (s.length() == 1)
            throw new ClassNotFoundException(s);
        System.out.println(3);
    }
}
class ClassNotFoundException extends Exception{
    public ClassNotFoundException (String message){
        super (message);
    }
}