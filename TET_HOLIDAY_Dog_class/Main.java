package TET_HOLIDAY_Dog_class;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.printDogDetail();
    }
}
class Dog {
    private String name ="Micky", breed ="Husky";
    private int age=12;

    public void setName(String name) {
        this.name = name;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void printDogDetail(){
        System.out.println("Name:" + name+ "--Breed:"+breed+ "--Age:"+age);
    }
    
}