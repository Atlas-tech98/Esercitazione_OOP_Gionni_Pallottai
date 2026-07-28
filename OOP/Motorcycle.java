public class Motorcycle extends Vehicle {
    
    private boolean sportive;

    public Motorcycle(String brand, String model, int year, boolean sportive) {

        super(brand, model, year);
        this.sportive = sportive;
    }

    public boolean isSportive() {
        return sportive;
    }

    public void setSportive(boolean sportive) {
        this.sportive = sportive;
    } 

    @Override
    public String toString() {
        return super.toString() + " - Sportiva: " + sportive;
    }
}