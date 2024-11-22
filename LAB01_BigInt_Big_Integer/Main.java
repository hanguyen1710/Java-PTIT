package LAB01_BigInt_Big_Integer;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = Integer.parseInt(scanner.nextLine());
        while (test -- >0){
            String s[] = scanner.nextLine().split("\\s+");
            BigInteger bigInteger = new BigInteger(s[0]);
            BigInteger bigInteger2 = new BigInteger(s[2]);
            if(s[1].equals("-")){
               System.out.println( bigInteger.subtract(bigInteger2));
            }
            else if(s[1].equals("+")){
                System.out.println(bigInteger.add(bigInteger2));
            }
            else {
                System.out.println(bigInteger.multiply(bigInteger2));
            }
        }
    }
}
