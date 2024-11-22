package EXCEPTION003_Vowels;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = Integer.parseInt(scanner.nextLine());
        while (test -- >0){
            try{
                String s = scanner.nextLine();
                Main main = new Main();
                System.out.println(main.hasVowels(s));
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
    public String hasVowels (String str) throws Exception{
        // a, e, i, o, u, A, E, I, O, U
        for (int i =0 ; i < str.length(); i++){
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
            || str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I'
            || str.charAt(i) == 'O' || str.charAt(i) == 'U'){
                return "String has vowels";
            }
        }
        throw new Exception("String not contain vowels");
    }
}

