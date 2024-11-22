package Excercises.Excercies_20201108.StudentClass;


import java.util.ArrayList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        while(true) {
            try {
                students.add(new Student(sc.nextLine(), Integer.parseInt(sc.nextLine())));
            } catch (Exception e){
                break;
            }
        }
        for (Student student : students) {
            student.display();
        }
        System.out.println(Student.numeberOfStudents);

    }
}
class Student {
    private String name;
    private int age;
    public static int numeberOfStudents = 0;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        numeberOfStudents++;
    }

    public void display() {
        if (age >= 18) {
            System.out.println(name);
        }
    }
}