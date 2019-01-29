import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Functions {
    public static Predicate<Integer> isEven() {
        return p -> p % 2 == 0;
    }

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5,8,18,24);
        for (int num : nums) {
            if (isEven().test(num)) {
                System.out.print(num + " ");
            }
        }

    }

// outputs 2 4
// Example continues
}
