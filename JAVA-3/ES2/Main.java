import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Person> people = new ArrayList<>();

        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 15));
        people.add(new Person("Charlie", 35));

        System.out.println("Lista persone:");

        for (int i = 0; i < people.size(); i++) {
            System.out.println(i + " - " + people.get(i).getName());
        }

        System.out.print("Quale persona vuoi modificare? (inserisci l'indice): ");
        int index = scanner.nextInt();

        scanner.nextLine(); 

        if (index >= 0 && index < people.size()) {
            
            System.out.print("Inserisci il nuovo nome: ");
            String newName = scanner.nextLine();

            System.out.print("Inserisci la nuova età: ");
            int newAge = scanner.nextInt();

            Person newPerson = new Person(newName, newAge);

            people.set(index, newPerson);

            System.out.println("Persona modificata con successo!");
            
    } else {
            System.out.println("Indice non valido.");
        }

        System.out.println("Lista aggiornata delle persone:");
        for (int i = 0; i < people.size(); i++) {
            System.out.println(i + " - " + people.get(i).getName() + ", Età: " + people.get(i).getAge());
        }

        scanner.close();
    }
}
