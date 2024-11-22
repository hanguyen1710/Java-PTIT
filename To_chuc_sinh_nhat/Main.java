package To_chuc_sinh_nhat;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());

        while (test-- > 0) {
            ArrayList<Birthable> birthables = new ArrayList<>();
            while (true) {
                String input = sc.nextLine();
                if (input.equals("End")) break;
                String[] info = input.split(" ");
                if (info[0].equals("Citizen")) {
                    Citizen citizen = new Citizen(info[1], Integer.parseInt(info[2]), info[3], info[4]);
                    birthables.add(citizen);
                } else if (info[0].equals("Pet")) {
                    Pet pet = new Pet(info[1], info[2]);
                    birthables.add(pet);
                }
            }
            int yearFilter = Integer.parseInt(sc.nextLine());
            boolean found = false;
            for (Birthable birthable : birthables) {
                String birthDate = birthable.getBirthDate();
                if (birthDate.endsWith(String.valueOf(yearFilter))) {
                    System.out.println(birthDate);
                    found = true;
                }
            }
            if (!found) {
                System.out.println(" ");
            }
        }
    }
}

interface Identifiable {
    String getId();
}

interface Birthable {
    String getBirthDate();
}

class Citizen implements Identifiable, Birthable {
    private String name;
    private int age;
    private String id, birthDate;

    public Citizen(String name, int age, String id, String birthDate) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDay(String birthDay) {
        this.birthDate = birthDay;
    }
}

class Pet implements Birthable {
    private String name, birthDate;

    public Pet(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
}