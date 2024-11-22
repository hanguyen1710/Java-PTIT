package STRING005_Pangram;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        while (test -- >0){
            String s = sc.nextLine();
            Main main = new Main();
            System.out.println(main.pangram(s));
        }
    }
    public boolean pangram (String s){
        int cnt =0;
        for (char c ='a' ; c<='z'; c++){
            if (s.contains(s.valueOf((char) (c-32)))){ // ham contains su dung de kiem tra xem chuoi s co chua chu c hay khong
                return false;
            }
            if(s.contains(s.valueOf(c))){
                // ham valueOf(c) se chuyen doi ki tu c thanh chuoi
                cnt++;
            }
        }
        if(cnt >=26) return true;
        else return false;
    }
}
