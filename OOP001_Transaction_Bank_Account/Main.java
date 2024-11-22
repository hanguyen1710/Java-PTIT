package OOP001_Transaction_Bank_Account;

public class Main {
    public static void main(String[] args) {
        BankAccount savings = new BankAccount("Jimmy");

        savings.deposit(10.00);

        savings.deposit(50.00);

        savings.deposit(10.00);

        savings.deposit(70.00);

        System.out.println(savings.transactionFee(5.00));

        System.out.println(savings.transactionFee(10.00));
    }
}
class  BankAccount{
    //TODO: Khởi tạo id (String), balance (double) và transactions (int) để đếm số lượng giao dịch
    private String id;
    private double balance =0;
    private int transactions =0;

    public BankAccount(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public int getTransactions() {
        return transactions;
    }
    public void deposit(double amount) {
        balance += amount;
        transactions ++;
    }
    public void withdraw(double amount){
        balance -= amount;
        transactions ++;
    }
    public boolean transactionFee(double amount){
        for (int i=1; i <= transactions ; i++){
            balance -= amount * (i*2);
        }
        if(balance > 0.00){
            return true;
        }
        else return false;
    }
}
