package OOP010_Constructor_overloading;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Tape measure");
        System.out.println(product1);
        Product product2 = new Product("Plaster", "home improvement section");
        System.out.println(product2);
        Product product3 = new Product("Tyre", 5);
        System.out.println(product3);
    }
    
}
class Product{
    private String name,location;
    private int weight;

    public Product (String name){
        this.name = name;
        location = "shelf";
        weight =1;
    }
    public Product (String name,String location ){
        this.name = name;
        this.location = location;
        weight =1;
    }
    public Product(String name, int weight){
        this.name = name;
        location = "shelf";
        this.weight = weight;
    }
    @Override
    public String toString(){
        return name +" (" + weight +"kg) can be found from the "+location;
    }

}