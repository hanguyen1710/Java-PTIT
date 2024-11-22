package INHERITANCE007_Test_Questions;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = Integer.parseInt(scanner.nextLine());
        System.out.println(test);
        while (test -- >0){
            String type = scanner.nextLine();
            System.out.println(type);
            if (type.equals("e")){
                Eassy eassy = new Eassy(Integer.parseInt(scanner.nextLine()), scanner.nextLine());
                eassy.readQuestion();
            }
            else {
                ArrayList<String> options = new ArrayList<>();
                int line = Integer.parseInt(scanner.nextLine());
                String question = scanner.nextLine();
               for (int i=0 ; i< line ; i++){
                   options.add(scanner.nextLine());
               }
                MultChoice multChoice = new MultChoice(line, question, options);
                multChoice.readQuestion();
            }
        }
    }
}
abstract class TagQuestions{
    protected String questions;
    protected abstract void readQuestion();
}
class Eassy extends TagQuestions{
    private int line;

    public Eassy(int line, String questions) {
        this.line = line;
        super.questions = questions;
    }
    public void readQuestion(){
        System.out.println(line);
        System.out.println(questions);
    }
}
class MultChoice extends TagQuestions{
    private int line;
    private ArrayList<String> options;

    public MultChoice(int line, String questions, ArrayList<String> options) {
        this.line = line;
        super.questions = questions;
        this.options = options;
    }

    public void readQuestion(){
        System.out.println(line);
        System.out.println(questions);
        for (String option : options){
            System.out.println(option);
        }
    }
}
