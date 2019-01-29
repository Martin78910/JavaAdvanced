import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class CreatingNewSet {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<String>();
        set.add("Pesho");
        set.add("Gosho");
        set.add("Jony");
        set.add("Tosho");
        set.add("Ivan");
        set.add("Stamat");
        set.add("Maria");
        set.add("Ira");
        set.add("Gosho");
        System.out.println(set);
        set.remove("Gosho");
        System.out.println(set);


    }
}
