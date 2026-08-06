public class Drink {
    private String name;
    private double price;
    private boolean isAlcoholic;

    public Drink(String name, double price, boolean isAlcoholic) {
        this.name = name;
        this.price = price;
        this.isAlcoholic = isAlcoholic;
    }

    //Getter
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAlcoholic() {
        return isAlcoholic;
    }

    //Setter
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAlcoholic(boolean alcoholic) {
        isAlcoholic = alcoholic;
    }
}