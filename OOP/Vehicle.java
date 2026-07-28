public class Vehicle {

    private String brand;
    private String model;
    private int year;

    public Vehicle(String brand, String model, int year) {

        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year ) {
        this.year = year;
    }

    @Override
    public boolean equals(Object obj) {

        if(this == obj)
            return true;

        if(obj == null || getClass() != obj.getClass())
            return false;

        Vehicle vehicle2 = (Vehicle) obj;

        return year == vehicle2.year &&
            brand.equals(vehicle2.brand) &&
            model.equals(vehicle2.model);
    }

    @Override
    public String toString() {
        return brand + " " + model + " (" + year + ")";
    }
}