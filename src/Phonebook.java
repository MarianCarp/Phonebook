import java.util.Enumeration;
import java.util.Stack;

public class Phonebook {
    Stack<Contact> contacts;
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

    }
    public void show(){

    }
    public void edit(){

    }
    public void delete(){

    }
}
