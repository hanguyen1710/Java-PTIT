package Huan_luyen_vien_Pokemon;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Trainer> trainers = new LinkedHashMap<>();
        while(true){
            String input = sc.nextLine();
            if(input.equals("Tournament")) break;
            String [] info = input.split(" ");
            trainers.putIfAbsent(info[0], new Trainer(info[0]));
            trainers.get(info[0]).addPokemon(new Pokemon(info[1], info[2], Integer.parseInt(info[3])));
        }
        while (true){
            String element = sc.nextLine();
            if (element.equals("End")) break;
            for (Trainer trainer: trainers.values()){
                if(trainer.hasPokemonWithElement(element)){
                    trainer.increaseBadges();
                }
                else {
                    trainer.reducePokemonHealth();
                }
            }
        }
        trainers.values().stream()
                .sorted(Comparator.comparingInt(Trainer::getNumberOfBadges).reversed())
                .forEach(trainer -> System.out.println(trainer.getName() + " " + trainer.getNumberOfBadges() + " " + trainer.getNumberPokemon()));
    }
}
class Pokemon {
    private String name,element;
    private int health;

    public Pokemon(String name, String element, int health) {
        this.name = name;
        this.element = element;
        this.health = health;
    }

    public void reduceHealth(int amount){
        health -= amount;
    }
    public boolean isAlive(){
        return health > 0;
    }

    public String getElement() {
        return element;
    }
}
class Trainer{
    private String name;
    private int numberOfBadges;
    private List<Pokemon> pokemons;

    public Trainer(String name) {
        this.name = name;
        this.numberOfBadges = 0;
        this.pokemons = new ArrayList<>();
    }
    public void addPokemon (Pokemon pokemon){
        pokemons.add(pokemon);
    }
    public boolean hasPokemonWithElement(String element){
        for (Pokemon pokemon:pokemons){
            if(pokemon.getElement().equals(element)){
                return true;
            }
        }
        return false;
    }
    public void increaseBadges(){
        numberOfBadges ++;
    }
    public void reducePokemonHealth(){
        for (Pokemon pokemon:pokemons){
            pokemon.reduceHealth(10);
        }
        pokemons.removeIf(pokemon -> !pokemon.isAlive());
    }

    public String getName() {
        return name;
    }

    public int getNumberOfBadges() {
        return numberOfBadges;
    }
    public int getNumberPokemon(){
        return pokemons.size();
    }
}
