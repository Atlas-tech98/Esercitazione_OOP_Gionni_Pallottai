public class App {
    public static void main(String[] args) throws Exception {
        Employee marco = new Employee("Marco", "Rossi", 30, "Manager", 50000);

        Student clara = new Student("Clara", "Bianchi", 20, 28);

        marco.displayInfo();
        clara.displayInfo();
    }
}