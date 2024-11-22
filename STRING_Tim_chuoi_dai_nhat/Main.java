package STRING_Tim_chuoi_dai_nhat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = Integer.parseInt(scanner.nextLine());
        while (test-- > 0) {
            String s = scanner.nextLine();
            Main main = new Main();
            System.out.println(main.findLongestWord(s));
            
        }

    }

    public String findLongestWord(String sentence) {
        String result ="";
        String [] s = sentence.split("\\s+");
        for (int i =0; i<s.length; i++){
            if (s[i].length() >= result.length()){
                result = s[i];
            }
        }
        return result;
    }
}
