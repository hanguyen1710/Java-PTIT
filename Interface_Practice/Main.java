package Interface_Practice;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Fyodor Dostoevsky", "Crime and Punishment",2);
        Book book2 = new Book("Robert Martin", "Clean Code", 1);
        Book book3 = new Book("Kent Beck", "Test Driven Development", 0.5);
        CD cd1 = new CD ("Pink Floyd", "Dark Side of the Moon", 1973);
        CD cd2 = new CD ("Wigwam", "Nuclear Nightclub", 1975);
        CD cd3 = new CD("Rendezvous Park", "Closer to Being Here", 2012);
        System.out.println(book1 + "\n" + book2+"\n"+book3);
        System.out.println(cd1 + "\n" + cd2+"\n"+cd3);
    }
}
interface Packable{
    double weight();
}
class Book implements Packable{
    private String author, name;
    private double weight;

    public Book(String author, String name, double weight) {
        this.author = author;
        this.name = name;
        this.weight = weight;
    }
    public double weight(){
        return weight;
    }
    @Override
    public String toString(){
        return author +": "+name;
    }
}
class CD implements Packable{
    private String artist,name;
    private int publicationYear;

    public CD(String artist, String name, int publicationYear) {
        this.artist = artist;
        this.name = name;
        this.publicationYear = publicationYear;
    }
    public double weight(){
        return 0.1;
    }
    @Override
    public String toString(){
        return artist + ": " + name+ " ("+publicationYear+")";
    }
}
