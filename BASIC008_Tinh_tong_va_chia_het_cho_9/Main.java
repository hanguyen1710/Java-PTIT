package BASIC008_Tinh_tong_va_chia_het_cho_9;

public class Main {
    public static void main(String[] args) {
        int sum =0;
        Main main = new Main();
        System.out.println("Numbers between 100 and 200, divisible by 9:");
        for (int i=101; i<=200; i++){
            if(i % 9 == 0){
                sum+=i;
                System.out.println(i);
            }
        }
        System.out.println(sum);
    }
}
