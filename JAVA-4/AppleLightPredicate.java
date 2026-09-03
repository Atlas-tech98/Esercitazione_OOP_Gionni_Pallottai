public class AppleLightPredicate implements ApplePredicateInterface {
    private int weight;

    public AppleLightPredicate(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() < weight;
    }

}
