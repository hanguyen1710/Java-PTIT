package ELAB2303_Class_MyStuff;

class MyStuff {
    private String name;

    MyStuff(String name) {
        this.name = name;
    }

    
    public boolean equals (MyStuff myStuff) {
        if (name.equals(myStuff.name))
            return true;
        else
            return false;
    }
}

public class Main {
    public static void main(String[] args) {
        MyStuff m1 = new MyStuff("PC");
        MyStuff m2 = new MyStuff("PC");

        // a.
        System.out.print("value compared: ");
        if (m2.equals(m1))
            System.out.println("same");
        else
            System.out.println("different");

        System.out.print("reference compared: ");
        if (m2 == m1)
            System.out.println("same");
        else
            System.out.println("different");
    }
}