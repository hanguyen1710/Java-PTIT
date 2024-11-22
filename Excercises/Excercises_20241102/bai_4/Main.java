package Excercises.Excercises_20241102.bai_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hex = sc.nextLine();
        Main main = new Main();
        int dec = main.convertHexToDecimal(hex);
        System.out.println(main.convertDecimalToBinary((dec)));
    }
    public int convertHexToDecimal (String hex){
        int dec =0;
        for (int i=0; i< hex.length(); i++){
            int num = (int) Math.pow(Double.parseDouble(String.valueOf(16)),Double.parseDouble(String.valueOf(i)));
            switch (hex.toCharArray()[hex.length()-i-1]){
                case '1','2','3','4','5','6','7','8','9':
                    dec += Integer.parseInt(String.valueOf(hex.toCharArray()[hex.length()-i-1])) * num;
                    break;
                case 'A':
                    dec += 10 * num;
                    break;
                case 'B':
                    dec += 11 * num;
                    break;
                case 'C':
                    dec += 12 * num;
                    break;
                case 'D':
                    dec += 13 * num;
                    break;
                case 'E':
                    dec += 14 * num;
                    break;
                case 'F':
                    dec += 15 * num;
                    break;
            }
        }
        return dec;
    }
    public String convertDecimalToBinary(int dec){
        StringBuilder bin = new StringBuilder();
        while (dec > 0){
            bin.append(dec%2);
            dec /= 2;
        }
        return  bin.reverse().toString();
    }
}
