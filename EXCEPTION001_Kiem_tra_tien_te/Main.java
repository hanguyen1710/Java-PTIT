package EXCEPTION001_Kiem_tra_tien_te;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        while (test-- > 0) {
            try {
                String s[] = sc.nextLine().split("\\s+");
                Amount amount1 = new Amount(s[0], Integer.parseInt(s[1]));
                Amount amount2 = new Amount(s[2], Integer.parseInt(s[3]));
                System.out.println(amount1.add(amount2));

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

class Amount {
    private String currency;
    private int amount;

    public Amount(String currency, int amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public int add(Amount amount) throws Exception {
        if (amount.currency.equals(this.currency)) {
            return amount.amount + this.amount;
        } else
            throw new Exception("Currency doesn't match");
    }
}