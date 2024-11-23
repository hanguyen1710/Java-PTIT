package Kiem_tra_diem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        while(test -- > 0){
            try{
                String fileName = sc.nextLine();
                Main main = new Main();
                System.out.println(main.CheckFileExtension(fileName));
            }
            catch (NotJavaFileException e){
                System.out.println(e.getMessage());
            }
        }
    }
    public int CheckFileExtension(String fileName) throws NotJavaFileException{
        if (fileName.isEmpty()){
            throw new NotJavaFileException("Not java file exception.Mark is -1");
        }
        else {
            if (fileName.endsWith(".java")){
                return 1;
            }
            else {
                return 0;
            }
        }
    }
}
class NotJavaFileException extends Exception{
    public NotJavaFileException (String message){
        super(message);
    }
}

