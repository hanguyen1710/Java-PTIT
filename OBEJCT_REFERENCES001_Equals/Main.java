package OBEJCT_REFERENCES001_Equals;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = Integer.parseInt(scanner.nextLine());
        while (test -- >0){
            String [] arr1 = scanner.nextLine().split("\\s+");
            String [] arr2 = scanner.nextLine().split("\\s+");
            Song song1 = new Song (arr1[0], arr1[1], Integer.parseInt(arr1[2]));
            Song song2 = new Song(arr2[0], arr2[1], Integer.parseInt(arr2[2]));
            System.out.println(song1.equals(song2));
        }
    }
}
class Song {
    private String name, author;
    private int duration;

    public Song(String name, String author, int duration) {
        this.name = name;
        this.author = author;
        this.duration = duration;
    }
    @Override
    public boolean equals (Object song){
        if (!(song instanceof Song)){
            return false;
        }
        else {
            Song s = (Song) song;
            if (s.author.equals(this.author) && s.name.equals(this.name) && s.duration == this.duration){
                return true;
            }
            else return false;
        }
    }
}
