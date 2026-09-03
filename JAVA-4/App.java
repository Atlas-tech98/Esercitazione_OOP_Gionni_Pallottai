import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) throws Exception {

        List<Apple> apples = List.of(
            new Apple(Color.RED, 150),
            new Apple(Color.GREEN, 200),
            new Apple(Color.RED, 180),
            new Apple(Color.GREEN, 130),
            new Apple(Color.RED, 100),
            new Apple(Color.GREEN, 160),
            new Apple(Color.RED, 140)
        );

        // List<Apple> applesFiltered = filterApples(apples, Color.RED);

        // for (Apple apple : applesFiltered) {
        //     System.out.println(apple.getColor());
        // }

        // List<Apple> applesFilteredByWeight = filterApplesByWeight(apples, 150);
        
        // for (Apple apple : applesFilteredByWeight) {
        //     System.out.println(apple.getWeight());
        // }

        List<Apple> redApples = filterApples(apples, new AppleRedColorPredicate());
        List<Apple> greenApples = filterApples(apples, new AppleGreenColorPredicate());
        List<Apple> lightApples = filterApples(apples, new AppleLightPredicate(150));   
        List<Apple> heavyApples = filterApples(apples, new AppleWeightPredicate(150));

        System.out.println("Red Apples:");
        for (Apple apple : redApples) {
            System.out.println(apple.getColor());
        }

        System.out.println("Green Apples:");
        for (Apple apple : greenApples) {
            System.out.println(apple.getColor());
        }

        System.out.println("Light Apples:");
        for (Apple apple : lightApples) {
            System.out.println(apple.getWeight());
        }

        System.out.println("Heavy Apples:");
        for (Apple apple : heavyApples) {
            System.out.println(apple.getWeight());
        }
    }

    // public static List<Apple> filterApplesByWeight(List<Apple> apples, int weight) {
    //         List<Apple> result = new ArrayList<>();

    //         for (Apple apple : apples) {
    //             if (apple.getWeight() > weight) {
    //                 result.add(apple);
    //             }
    //         }

    //         return result;
    //     }

    // public static List<Apple> filterApples(List<Apple> apples, Color color) {
    //     List<Apple> result = new ArrayList<>();

    //     for (Apple apple : apples) {
    //         if (color.equals(apple.getColor())) {
    //             result.add(apple);
    //         }
    //     }

    //     return result;
    // }

    public static List<Apple> filterApples(List<Apple> apples, ApplePredicateInterface predicate) {
        List<Apple> result = new ArrayList<>();

        for (Apple apple : apples) {
            if (predicate.test(apple)) {
                result.add(apple);
            }
        }

        return result;
    }

    
}