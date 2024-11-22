package ELAB2315_Note_Class;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalAccount = Integer.parseInt(sc.nextLine());
        ArrayList<Account> accounts = new ArrayList<>();
        for (int i=1; i<= totalAccount; i++){
            String name = sc.nextLine();
            String regex = ".*\\d.*"; // Bieu thuc chinh quy chi rang co it nhat 1 so trong xau
            Pattern pattern = Pattern.compile(regex); // Khoi tao mau de bien dich/tim kiem theo bieu thuc chinh quy tren
            Matcher matcher = pattern.matcher(name); // Tiem kiem trong String name xem co chu so hay khong
            if(matcher.matches()){ // Neu co chu so
                System.out.println("invalid input");
                return;
            }
            else{
                Account account = new Account(i, name);
                accounts.add(account);
            }
        }
        while (true){
            try{
                String options [] = sc.nextLine().split("\\s+");
                String content ="";
                for (int i=3; i<options.length; i++){
                    content += options[i] +" ";
                }

                if(options[1].equals("Add")){
                    for (Account account : accounts){
                        if(options[0].equals(account.getId())){
                            Note note = new Note(account.getNotes().size() + 1, content, options[2]);
                            account.addNote(note);
                        }
                    }
                }
                else if(options[1].equals("Share")){
                    for (Account account : accounts){
                        if(options[0].equals(account.getId())){
                            Note note =  account.getNotes().get(Integer.parseInt(options[3]) -1 );
                            for (Account accountShare : accounts){
                                if(options[2].equals(accountShare.getId())){
                                    account.shareNote(accountShare, note);
                                }
                            }
                        }
                    }
                }
                else {
                    throw new Exception("invalid input");
                }
            }
            catch (Exception e){
                if(e.getMessage().equals("invalid input")){
                    System.out.println("invalid input");
                    return;
                }
                break;
            }
        }
        for (Account account : accounts){
            System.out.println("Account: " + account.getName());
            for (Note note : account.getNotes()){
                System.out.println(note);
            }
        }
    }
}
class Account {
    private String id, name;
    private ArrayList <Note> notes;
    public Account (int id, String name){
        this.id = String.format("%03d", id);
        this.name = name;
        this.notes = new ArrayList<>();
    }
    public void addNote(Note note){
        notes.add(note);
    }
    public void shareNote(Account account, Note note){
        account.notes.add(note);
    }
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public ArrayList<Note> getNotes(){
        return notes;
    }
}
class Note {
    private String id, content, dateNote;

    public Note(int id, String content, String dateNote) throws Exception {
        if (dateNote.length() != 7)
            throw new Exception("invalid input");
        String month = dateNote.substring(0, 3);
        if (!(month.equals("Jan") || month.equals("Feb") || month.equals("Mar") || month.equals("Apr")
                || month.equals("May") || month.equals("Jun") || month.equals("Jul") || month.equals("Aug")
                || month.equals("Sep") || month.equals("Oct") || month.equals("Nov") || month.equals("Dec")))
            throw new Exception("invalid input");
        int date = Integer.parseInt(dateNote.substring(3, 5));
        if (date < 0 || date > 31)
            throw new Exception("invalid input");
        if (content.isEmpty())
            throw new Exception("invalid input");
        
        this.id = String.format("%d", id);
        this.content = content;
        this.dateNote = dateNote;
    }
    public String toString(){
        String month = dateNote.substring(0,3);
        String date = dateNote.substring(3, 5);
        String year = dateNote.substring(5);
        return date + " " + month + " "+ year + " | " + content.trim();
    }
}