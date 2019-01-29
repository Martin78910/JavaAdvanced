import java.util.Arrays;
import java.util.Scanner;

public class ArrayOfString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer number");
        int number = Integer.parseInt(scanner.nextLine());
        String[] names = new String[number];
        for (int i = 0; i <number ; i++) {
            names[i] = scanner.nextLine();

        }
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
    }
}
