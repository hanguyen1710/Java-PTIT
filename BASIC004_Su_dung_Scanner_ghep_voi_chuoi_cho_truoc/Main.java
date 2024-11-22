package BASIC004_Su_dung_Scanner_ghep_voi_chuoi_cho_truoc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = Integer.parseInt(scanner.nextLine());
        while (test -- >0){
            System.out.println("Hi "+ scanner.nextLine());
        }
    }
}
