package Excercises.Excercies_20201108.MyStuff;

class MyStuff {
    private String name;

    MyStuff(String name) {
        this.name = name;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof MyStuff) {
            MyStuff other = (MyStuff) obj;
            return this.name.equals(other.name);
        }
        return false;
    }
}
public class Main {
    public static void main(String[] args) {
        MyStuff m1 = new MyStuff("PC");
        MyStuff m2 = new MyStuff("PC");

        if (m2.equals(m1))
            System.out.println("value compared: same");
        else
            System.out.println("value compared: different");

        if (m2 == m1){
            System.out.println("reference compared: same");
        } else {
            System.out.println("reference compared: different");
        }
    }
}