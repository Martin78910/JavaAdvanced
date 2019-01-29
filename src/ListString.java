import java.util.*;

public class ListString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter an integer number: ");
        int n = Integer.parseInt(scanner.nextLine());
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            numbers.add(Integer.parseInt(scanner.nextLine())) ;
        }
        Collections.sort(numbers);
        System.out.println(numbers);
        Collections.reverse(numbers);
        System.out.println(numbers);
        System.out.println("First element " + numbers.get(0));
        System.out.println("Last element " + numbers.get(numbers.size()-1));
        System.out.println(numbers.size());
    }
}
