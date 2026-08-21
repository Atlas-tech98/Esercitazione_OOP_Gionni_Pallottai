import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();

        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 15));
        people.add(new Person("Charlie", 35));
        people.add(new Person("Clara", 17));
        people.add(new Person("Mario", 25));

        List<Person> peopleOver18 = new ArrayList<>();

        for (Person person : people) {
            if (person.getAge() >= 18) {
                peopleOver18.add(person);
            }
        }

        System.out.println("Persone con età maggiore o uguale a 18 anni:");

        for (Person person : peopleOver18) {
            person.printPerson();
        }
    }
}