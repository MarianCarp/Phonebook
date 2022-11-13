import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to your phonebook");
        Phonebook phonebook = new Phonebook();
        boolean exit = false;

        while (!exit){
            Scanner scanner = new Scanner(System.in);
            Menu.menu();

            switch (scanner.nextInt()){
                case 1:
                    phonebook.list();
                    break;
                case 2:
                    phonebook.add(String name,String surname,String number, int id);
                    break;
                case 3:
                    phonebook.show();
                    break;
                case 4:
                    phonebook.edit();
                    break;
                case 5:
                    phonebook.delete();
                    break;
                default:
                    System.out.println("Invalid entry");
                    break;
            }
            System.out.println("Would you like yo exit y/n?");


            if (scanner.next().charAt(0) == 'y') {
                exit = true;
            }else if (scanner.next().charAt(0)== 'n'){
                exit = false;
                            }
            else {
                System.out.println("Invalid letter");
            }
        }
    }
}
