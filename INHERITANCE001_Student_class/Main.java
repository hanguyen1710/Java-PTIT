package INHERITANCE001_Student_class;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        System.out.println(student);
        System.out.println("Study credits " + Student.getCredit());
        student.study();
        System.out.println("Study credits "+ Student.getCredit());
    }
}
class Person {
    private String name, address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }
    public String toString (){
        return name + " - "+address;
    }
}
class Student extends Person{
    private static int credit =0;
    public Student (String name, String address){
        super(name, address);
    }
    public void study (){
        credit ++;
    }

    public static int getCredit() {
        return credit;
    }
}
