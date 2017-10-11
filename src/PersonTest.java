
import java.util.Scanner;

public class PersonTest {
    public static void main(String[] args) throws NameUndefinedException, IncorrectAgeException {
        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj imię");
        String firstName = scan.nextLine();
        System.out.println("Podaj nazwisko");
        String lastName = scan.nextLine();

        System.out.println("Podaj wiek");
        int age = scan.nextInt();
        scan.nextLine();

        System.out.println("Podaj pesel");
        String pesel = scan.nextLine();
        try {
            Person person = new Person(firstName, lastName, age, pesel);
            System.out.println(person.toString());
        } catch (NameUndefinedException ex) {
            System.err.println("Wartość zbyt krótka lub null");
        } catch (IncorrectAgeException ex) {
            System.err.println("Podany wiek jest mniejszy od 1");
        }


    }
}
