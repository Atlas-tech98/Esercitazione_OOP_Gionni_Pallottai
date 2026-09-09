public class Student extends Person {
    public int average;
    

    public Student(String name, String surname, int age, int average) {
        super(name, surname, age);
        this.average = average;
    }

    @Override
    public void displayInfo() {
        System.out.println("Ciao a tutti, mi chiamo " + name + " " + surname + ", e ho " + age + " anni e ho una media di " + average + " |");
    }
}