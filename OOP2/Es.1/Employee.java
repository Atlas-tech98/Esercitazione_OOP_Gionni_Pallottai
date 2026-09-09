public class Employee extends Person {
    public String position;
    public int salary;

    public Employee(String name, String surname, int age, String position, int salary) {
        super(name, surname, age);
        this.position = position;
        this.salary = salary;
    }

        @Override
    public void displayInfo() {
        System.out.println("Ciao a tutti, mi chiamo " + name + " " + surname + ", e ho " + age + "anni, ricopro il ruolo di " + position + " e percipisco uno stipendio di $" + salary);
    }
}