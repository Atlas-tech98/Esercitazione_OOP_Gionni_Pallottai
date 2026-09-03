public class AppleGreenColorPredicate implements ApplePredicateInterface {
    @Override
    public boolean test(Apple apple) {
        return Color.GREEN.equals(apple.getColor());
    }

}
