public class Car extends Vehicle {
    
    private int doorNumbers;

    public Car(String brand, String model, int year, int doorNumbers) {

        super(brand, model, year);
        this.doorNumbers = doorNumbers;
    }

    public int getDoorNumbers() {
        return doorNumbers;
    }

    public void setDoorNumbers(int doorNumbers) {
        this.doorNumbers = doorNumbers;
    } 

    @Override
    public String toString() {
        return super.toString() + " - Porte: " + doorNumbers;
    }
}