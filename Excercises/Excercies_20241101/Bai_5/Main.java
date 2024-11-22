package Bai_5;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double h = sc.nextDouble();
        double S_day = Math.PI * r * r;
        double S_mat = 2* S_day + 2 * Math.PI * r * h;
        double V = S_mat * h;
        System.out.println(String.format("%.3f",S_day) +"\n"+String.format("%.3f",S_mat) +"\n"+String.format("%.3f",V));

    }
}
