package BASIC010_Dao_so;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = Integer.parseInt(scanner.nextLine());
        while (test -- >0){
            int n = Integer.parseInt(scanner.nextLine());
            Main main = new Main();
            ArrayList <Integer> result = main.swapDigitPairs(n);
            for (Integer x : result){
                System.out.print(x);
            }
            System.out.println();
        }
    }
    public ArrayList<Integer> swapDigitPairs(int n){
        ArrayList<Integer> swap = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        while (n!=0){
            int r = n%10;
            swap.add(r);
            n/=10;
        }
        if (swap.size() % 2 == 1){
            result.add(swap.get(swap.size() -1));
            for (int i=swap.size()-2; i>=1; i-=2){
                result.add(swap.get(i-1));
                result.add(swap.get(i));
            }
        }
        else {
            for (int i=swap.size()-1; i>=1; i-=2){
                result.add(swap.get(i-1));
                result.add(swap.get(i));
            }
        }
        if (result.get(0) == 0){
            result.remove(result.get(0));
        }
        return result;
    }
    
}
