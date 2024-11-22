package STACK001_Compress_Duplicate;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = Integer.parseInt(scanner.nextLine());
        while (test -- >0){
            String [] arr = scanner.nextLine().split("\\s+");
            Stack<Integer> s = new Stack<>();
            for (int i=arr.length -1 ; i>=0; i--){
                s.push(Integer.parseInt(arr[i]));
            }
            Main main = new Main();
            Queue<Integer> result = main.compressDuplicates(s);
            while (!result.isEmpty()){
                if(result.size() == 1){
                    System.out.print(result.poll()); // ham poll() se lay ra phan tu dau tien cua Queue
                    break; // Khong lay phan tu null
                }
                System.out.print(result.poll() + " ");
            }
            System.out.println();
        }

    }
    public Queue<Integer> compressDuplicates(Stack<Integer> s){
        Queue<Integer> queue = new LinkedList<>(); // Queue la mot interface cua LinkedList
        while (!s.empty()){
            int count =1;
            int top = s.pop();
            while (!s.empty() && top == s.peek()){
                count ++;
                s.pop();
            }
            queue.add(count);
            queue.add(top);
        }
        return queue;
    }
}