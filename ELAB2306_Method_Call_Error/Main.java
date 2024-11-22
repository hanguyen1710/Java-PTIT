package ELAB2306_Method_Call_Error;

import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = Integer.parseInt(sc.nextLine());
        if(s == 0){
            MyMethods.m(1);
        }
        else if(s == 1){
            MyMethods.m(0);
        }
        else {
            MyMethods.m(2);
        }
    }
}
class MyMethods {
    public static void m(int x) {
        try {
            m2(x);
            System.out.println(1);
        } catch (IOException e) {
            System.out.println(2);
        } catch (ArithmeticException e) {
            System.out.println(3);
        }
    }

    public static void m2(int x) throws ArithmeticException, IOException {
        System.out.println(4);
        if (x == 1)
            throw new IOException();
        if (x == 0)
            throw new ArithmeticException();
        if (x==2) System.out.println(5);
    }
}