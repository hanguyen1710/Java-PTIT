package OOP015_Person_toString;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = Integer.parseInt(scanner.nextLine());
        while (test -- >0){
            Person person = new Person(scanner.nextLine(), scanner.nextLine());
            System.out.println(person);
        }
    }
}
class Person {

    private String name, address;

    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }
    @Override
    public String toString (){
        return name + " - "+address;
    }
}