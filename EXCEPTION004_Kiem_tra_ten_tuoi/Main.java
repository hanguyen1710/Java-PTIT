package EXCEPTION004_Kiem_tra_ten_tuoi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = Integer.parseInt(scanner.nextLine());
        while (test -- >0){
            try {
                Person person = new Person(scanner.nextLine(), Integer.parseInt(scanner.nextLine()));
                System.out.println("Name: " + person.getName()+ "--Age:"+ person.getAge());
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName () throws Exception{
        if (name.isEmpty() || name.length() > 40){
            throw new Exception("Name is not valid");
        }
        else return name;
    }
    public int getAge () throws Exception{
        if(age < 0 || age > 120){
            throw new Exception("Age is not valid");
        }
        else return age;
    }
}