package ELAB2302_Student_class;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            try{
                String name = sc.nextLine();
                int age = Integer.parseInt(sc.nextLine());
                Student student = new Student(name, age);
                student.display();
            }
            catch (Exception e){
                break;
            }
        }
        System.out.println(Student.numberOfStudent);
    }
}
class Student{
    private String name;
    private int age;
    public static int numberOfStudent;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
        numberOfStudent ++;
    }
    public void display(){
        if(age >= 18){
            System.out.println(name);
        }
    }
}