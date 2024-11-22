package ELAB2312_Number_Character;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            try{
                String s[] = scanner.nextLine().split("\\D+");// tach theo chu
                int sum = Integer.parseInt("0");
                for (int i=0; i<s.length; i++){
                    sum+= s[i].length();
                }
                System.out.println(sum);
            }
            catch (Exception e){
                break;
            }
        }
    }
}
