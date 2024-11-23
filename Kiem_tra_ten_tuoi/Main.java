package Kiem_tra_ten_tuoi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        while(test -- > 0){
            try{
                Person person = new Person(sc.nextLine(), Integer.parseInt(sc.nextLine()));
                person.checkNameAge();
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
class Person{
    private String name;
    private int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void checkNameAge () throws Exception{
        if (name.isEmpty() || name.length() > 40){
            throw new Exception("Name is not valid");
        }
        if(age < 0 || age > 120){
            throw new Exception("Age is not valid");
        }
        else{
            System.out.println(this.toString());
        }
    }
    @Override
    public String toString(){
        return "Name: " + name + "--Age:"+age;
    }
}
