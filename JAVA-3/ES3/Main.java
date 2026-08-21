import java.util.List;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Mela");
        list.add("Banana");
        list.add("Ciliegia");
        list.add("Pesca");
        list.add("Ciliegia");
        list.add("Mela");
        list.add("Mela");

        System.out.println("Prima lista:");
        System.out.println(list);

        List<String> noDuplicateList = new ArrayList<>();
        
        for (String fruit : list) {
            if (!noDuplicateList.contains(fruit)) {
                noDuplicateList.add(fruit);
            }
        }

        System.out.println("Lista senza duplicati:");
        System.out.println(noDuplicateList);
    }
}
