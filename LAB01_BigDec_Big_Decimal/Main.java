package LAB01_BigDec_Big_Decimal;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        int test = Integer.parseInt(sc.nextLine());
        while (test -- > 0){
            String [] s = sc.nextLine().split("\\s+");
            BigDecimal result = BigDecimal.ZERO;
            for (String phanTu : s){
                String nguyen = phanTu.split("\\.")[0];
                result = result.add(new BigDecimal(phanTu).subtract(new BigDecimal((nguyen))));
            }
            System.out.println(result);
        }
    }
}
