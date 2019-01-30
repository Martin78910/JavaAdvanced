import java.util.Arrays;
import java.util.Scanner;

public class ArrayIntExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] number = new int[n];
        for (int i = 0; i < n; i++) {
            number[i] = scanner.nextInt();

        }
        System.out.println(Arrays.toString(number));
        for (int z = 0; z < number.length; z++) {
            System.out.printf("array element %d -> %d%n",z, number[z] );

        }
            Arrays.sort(number);
            System.out.println(Arrays.toString(number));
        System.out.println(number.length);
    }
}
