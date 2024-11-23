package Kiem_tra_tien_te;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        while(test -- > 0){
            String [] amounts = sc.nextLine().split(" ");
            try {
                Amount amount1 = new Amount(amounts[0], Integer.parseInt(amounts[1]));
                Amount amount2 = new Amount(amounts[2], Integer.parseInt(amounts[3]));
                System.out.println(amount1.add(amount2));
            }
            catch (Exception e){
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

    public int add (Amount amount) throws Exception{
        if (this.currency.equals(amount.currency)){
            return this.amount + amount.amount;
        }
        else {
            throw new Exception("Currency doesn't match");
        }
    }
}
