public class Main {

    public static void main(String[] args) {

        Car car1 = new Car("Fiat", "Panda", 2022, 5);
        Car car2 = new Car("Lamborghini", "Huracan", 2024, 3);

        Motorcycle motorcycle1 = new Motorcycle("Yamaha", "R1", 2023, true);
        Motorcycle motorcycle2 = new Motorcycle("Harley-Davidson", "Pan America", 2026, false);

        System.out.println(car1);
        System.out.println(motorcycle1);

        // uso dei getter
        System.out.println("Marca: " + car1.getBrand());

        //uso dei setter
        car1.setBrand("Ford");
        System.out.println("Nuova marca: "+ car1.getBrand());

        if (car1.equals(car2)) {
            System.out.println("Le due auto sono auguali");
        } else {
            System.out.println("Le due auto sono diverse");
        }
    }
}