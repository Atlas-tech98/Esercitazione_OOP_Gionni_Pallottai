public class App {
    public static void main(String[] args) {
        // Create some dishes
        Dish dish1 = new Dish("Spaghetti Carbonara", 12.50, new String[]{"Spaghetti", "Eggs", "Pancetta", "Parmesan"});
        Dish dish2 = new Dish("Margherita Pizza", 10.00, new String[]{"Pizza Dough", "Tomato Sauce", "Mozzarella", "Basil"});

        // Create some drinks
        Drink drink1 = new Drink("Coca-Cola", 2.50, false);
        Drink drink2 = new Drink("Red Wine", 5.00, true);

        // Create arrays of dishes and drinks
        Dish[] dishes = {dish1, dish2};
        Drink[] drinks = {drink1, drink2};

        // Create a restaurant
        Restaurant restaurant = new Restaurant("La Trattoria", dishes, drinks);

        restaurant.printMenu();
    }
}