import java.util.*;

public class ArrayListIntExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Integer> number = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            number.add(scanner.nextInt());
        }
        System.out.println(number);
        Collections.reverse(number);
        System.out.println(number);
        Collections.sort(number);
        System.out.println(number);
        System.out.println(number.get(1));
        System.out.println("List size is: " + number.size());
        number.addAll(Arrays.asList(76,34,56,78));
        System.out.println(number);
        System.out.println("Now list size is: " + number.size());

    }
}
