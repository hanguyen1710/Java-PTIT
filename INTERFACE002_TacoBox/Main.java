package INTERFACE002_TacoBox;

public class Main {
    public static void main(String[] args) {
        TripleTacobox tripleTacobox = new TripleTacobox();
        tripleTacobox.eat();
        tripleTacobox.eat();
        System.out.println("Triple taco boxes left: "+ tripleTacobox.tacoRemaining());
        CustomTacoBox customTacoBox = new CustomTacoBox(8);
        customTacoBox.eat();
        System.out.println("Custom taco boxes left: "+ customTacoBox.tacoRemaining());
    }
}
interface TacoBox {
    public int tacoRemaining();
    public void eat();
}
class TripleTacobox implements TacoBox{
    private int tacos;
   public TripleTacobox (){
       tacos =3;
   }
    @Override
    public int tacoRemaining(){
        return tacos;
    }
    @Override
    public void eat(){
        tacos -=1;
    }
}
class CustomTacoBox implements TacoBox{
    private int tacos;
    public CustomTacoBox (int initialTaco){
        this.tacos = initialTaco;
    }
    @Override
    public int tacoRemaining(){
        return tacos;
    }
    @Override
    public void eat(){
        tacos -=1;
    }
}