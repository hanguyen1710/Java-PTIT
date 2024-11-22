package STRING004_Su_dung_StringBuffer_de_lay_chieu_dai_chuoi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = Integer.parseInt(scanner.nextLine());
        while (test -- >0){
            String s = scanner.nextLine();
            StringBuffer sb = new StringBuffer(s);
            System.out.println(sb.length());
        }
    }
}
