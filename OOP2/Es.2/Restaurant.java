public class Restaurant {
    private String name;
    private Dish[] dishes;
    private Drink[] drinks;

    public Restaurant(String name, Dish[] dis, Drink[] dr) {
        this.name = name;
        this.dishes = dis;
        this.drinks = dr;
    }

    public void printMenu() {
        System.out.println("Menu of " + name + ":");

        System.out.println("Dishes:");
        for (Dish dish : dishes) {
            System.out.println("- " + dish.getName() + ": " + dish.getPrice() + "$");
        }

        System.out.println("Drinks:");
        for (Drink drink : drinks) {
            System.out.println("- " + drink.getName() + ": " + drink.getPrice() + "$");
        }
    }

    //Getter
    public String getName() {
        return name;
    }
    public Dish[] getDishes() {
        return dishes;
    }

    public Drink[] getDrinks() {
        return drinks;
    }

    //Setter
    public void setName(String name) {
        this.name = name;
    }

    public void setDishes(Dish[] dishes) {
        this.dishes = dishes;
    }

    public void setDrinks(Drink[] drinks) {
        this.drinks = drinks;
    }
}