import java.util.ArrayList;
import java.util.Arrays;

public class List {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.addAll(Arrays.asList(11,15,25,374,9437,5346));
        Arrays.sort(new ArrayList[]{numbers});
        System.out.println(numbers);
        numbers.remove(3);
        System.out.println(numbers);
        numbers.add(3,234);
        System.out.println(numbers);
        System.out.println(numbers.get(0));


    }
}
