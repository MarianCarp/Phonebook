import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Stack;

public class Phonebook {
    public List Contacts = new ArrayList<>();
    public Phonebook (){

    }
    public void add(String name, String surname, String number, int id){
        Contacts c = new Contacts(name, surname,number,id);
        if (Contacts.contains(c)){
            throw new RuntimeException("Contact already exist");
        }else {
            Contacts.add(c);
        }
    }
    public void show(){
        System.out.println("Look, this are your contacts");
    }
    public void edit(){
        System.out.println("Edit a contact");
    }
    public void delete(Contacts c){
        if (Contacts.contains(c)){
            Contacts.remove(c);
        }else {
            throw new RuntimeException("You dont have this contact in Phonebook")
        }
    }

    public void list() {
        System.out.println("This is you your Phonebook");
    }
}
