import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


public class FunctionsSecondExample {
    public static Predicate<Integer> isEven() {
        return p -> p % 2 == 0;
    }
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);

        nums.stream()

                .filter(isEven().negate())

                .forEach(System.out::println);

    }
}
