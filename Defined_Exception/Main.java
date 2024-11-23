package Defined_Exception;

import java.util.Scanner;

class FileNameFormatExeption extends Exception{
    public FileNameFormatExeption(String message){
        super(message);
    }
}

class Test {
    public static void open_file(String s) {
        try {
            // Gọi phương thức f() ném ngoại lệ
            f(s);
        } catch (FileNameFormatExeption fname) {
            System.out.println(fname.getMessage());
        } catch (Exception e){
            System.out.println("Exception");
        }
    }

    public static void f(String s) throws FileNameFormatExeption{
        String [] arr = s.split(" ");
        if(arr.length == 1){
            System.out.println("File opened");
        }
        else {
            throw new FileNameFormatExeption("File name format");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Test.open_file(s);
        sc.close();
    }
}