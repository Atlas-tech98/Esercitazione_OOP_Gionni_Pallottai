public class Dish {
    private String name;
    private double price;
    private String[] ingredients;

    public Dish(String name, double price, String[] ingredients) {
        this.name = name;
        this.price = price;
        this.ingredients = ingredients;
    }

    //Getter
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String[] getIngredients() {
        return ingredients;
    }

    //Setter

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setIngredients(String[] ingredients) {
        this.ingredients = ingredients;
    }
}