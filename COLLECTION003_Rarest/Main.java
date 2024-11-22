package COLLECTION003_Rarest;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        while (test -- >0){
            String [] s = sc.nextLine().split("\\s+");
            Map<String, Integer> map = new HashMap<>();
            for (int i=0; i<s.length -1; i+=2){
                map.put(s[i], Integer.parseInt(s[i+1]));
            }
            Main m = new Main();
            System.out.println(m.rarest(map));
        }

    }
    public int rarest (Map<String, Integer> map){
        Map<Integer, Integer> ageLoop = new HashMap<>();
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet){
            if(ageLoop.containsKey(entry.getValue())){
                int loop = ageLoop.get(entry.getValue());
                ageLoop.put(entry.getValue(), loop+1);
            }
            else {
                ageLoop.put(entry.getValue(), 1);
            }
        }
        ArrayList<Map.Entry<Integer, Integer>> ageLoopSort = new ArrayList<>(ageLoop.entrySet());
        ageLoopSort.sort(Map.Entry.comparingByValue());
        return ageLoopSort.get(0).getKey();

    }
}