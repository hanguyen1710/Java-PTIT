package COLLECTION002_Remove_shorter_strings;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        while (test -- >0){
            String [] s = sc.nextLine().split("\\s+");
            ArrayList<String> list = new ArrayList<>();
            for (int i=0; i<s.length; i++){
                list.add(s[i]);
            }
            Main m = new Main();
            System.out.println(m.removeShorterStrings(list));
        }

    }
    public String removeShorterStrings (ArrayList<String> s) {
        String res = "";
        for (int i = 0; i < s.size() - 1; i += 2) {
            if (s.get(i).length() > s.get(i + 1).length()) {
                res += s.get(i)+" ";
            } else {
                res += s.get(i + 1)+ " ";
            }
        }
        if (s.size() % 2 != 0) {
            res += s.get(s.size()-1)+" ";
        }
        return res.trim();
    }
}
