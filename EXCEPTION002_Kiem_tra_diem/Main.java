package EXCEPTION002_Kiem_tra_diem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = Integer.parseInt(scanner.nextLine());
        while (test -- >0){
            try{
                String s = scanner.nextLine();
                Main main = new Main();
                System.out.println(main.CheckFileExtension(s));
            }
            catch(NotJavaFileException n ){
                System.out.println(n.getMessage());
            }
            
        }
    }
    public int CheckFileExtension(String fileName) throws NotJavaFileException{
        if (!fileName.isEmpty()) {
            for (int i=0; i<fileName.length(); i++){
                if(fileName.charAt(i) == '.'){
                    return 1;
                }
            }
            return 0;
        }
        else throw new NotJavaFileException("Not java file exception.Mark is -1");
    }

}
class NotJavaFileException extends Exception{
    public NotJavaFileException (String message){
        super(message);
    }
}