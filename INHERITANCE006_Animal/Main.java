package INHERITANCE006_Animal;

public class Main {
    public static void main(String[] args) {
        Fish fish = new Fish();
        fish.play();
        fish.walk();
        Cat cat = new Cat("Fluffy");
        cat.play();
        cat.eat();
        Spider spider = new Spider();
        spider.eat();
        cat.walk();
        spider.walk();
    }
}
class Animal {
    protected int legs;

    protected Animal(int legs) {
        this.legs = legs;
    }
    public void walk(){
        System.out.println("This animal walks on " + legs + " legs.");
    }
    public void eat(){

    }
}
class Spider extends Animal{
    public Spider() {
        super(8);
    }
    public void eat(){
        System.out.println("The spider eats a fly.");
    }
}
class Fish extends Animal{
    private String name;

    public Fish() {
        super(0);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void play(){
        System.out.println("Fish swim in their tanks all day.");
    }
    public void walk(){
        super.walk();
        System.out.println("Fish, of course, can't walk; they swim.");
    }
    public void eat(){
        System.out.println("Fish eat pond scum.");
    }
}
class Cat extends Animal{
    private String name;

    public Cat( String name) {
        super(4);
        this.name = name;
    }
    public void play(){
        System.out.println(name + " likes to play with string.");
    }
    public void eat(){
        System.out.println("Cats like to eat spiders and mice.");
    }
}
