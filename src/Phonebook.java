import java.util.Enumeration;
import java.util.Stack;

public class Phonebook {
    Stack<Contact> contacts = new Stack<>();
    Phonebook (){

    }
    public void list() {
        if (this.contacts.empty()){
            System.out.println("Empty");
        }
        else {

            for (Enumeration<Contact> e = this.contacts.elements();e.hasMoreElements();){
                Contact contact = e.nextElement();
                System.out.println(contact.name +", " + contact.number);
            }

        }
    }
    public void add(){
        System.out.println("Contact added");

    }
    public void show(){
        System.out.println("Look, this are your contacts");
    }
    public void edit(){
        System.out.println("Edit a contact");
    }
    public void delete(){
        System.out.println("Delete it now");
    }
}
