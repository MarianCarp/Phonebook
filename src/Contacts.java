public class Contacts {
    private String name;
    private String surname;
    private String number;
    private int id = 0;

    public Contacts(String name, String surname, String number, int id) {
        this.name = name;
        this.surname = surname;
        this.number = number;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return id +"Phonebook entry [name="+ name + ", phone number=" + number +"]";
    }
}
