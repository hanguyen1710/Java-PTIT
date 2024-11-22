package LAB01_TwoSum_Two_Sum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = Integer.parseInt(scanner.nextLine());
        while (test -- >0){
            String [] arr = scanner.nextLine().split("\\s+");
            int n = Integer.parseInt(arr[0]);
            int target = Integer.parseInt(arr[arr.length -1]);
            int [] nums = new int[n];
            for (int i=0; i<n; i++){
                nums[i] = Integer.parseInt(arr[i+1]);
            }
            Main main = new Main();
            ArrayList<Integer> result = main.twoSum(n,target, nums);
            if (result.isEmpty()){
                System.out.println("Not found");
            }
            else {
                System.out.println(result.get(0) + " " + result.get(1));
            }
        }
    }
    public ArrayList<Integer> twoSum (int n, int target, int [] nums){
        ArrayList<Integer> result = new ArrayList<>();
        Map<Integer, Integer> checkSum = new HashMap<>();
        for (int i=0; i<n; i++){
            int check = target - nums[i];
            if (checkSum.containsKey(check)){
                result.add(checkSum.get(check));
                result.add(i);
                return result;
            }
            checkSum.put(nums[i], i);
        }
        return result;
    }
}