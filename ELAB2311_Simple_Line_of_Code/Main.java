package ELAB2311_Simple_Line_of_Code;

class A{
    public int x=0x1a;
    public void display(){
        System.out.println(x);
    }
}
class B extends A{
    public int x=0x1b;
}

public class Main{
    public static void main(String[] args){
	    A b= new B();
        b.display();
    }
}
