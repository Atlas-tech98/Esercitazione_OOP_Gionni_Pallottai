public class AppleWeightPredicate implements ApplePredicateInterface {
    private int weight;

    public AppleWeightPredicate(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() > weight;
    }

}
