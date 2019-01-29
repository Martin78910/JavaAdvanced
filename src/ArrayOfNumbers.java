import java.util.Arrays;
import java.util.Scanner;

public class ArrayOfNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter an integer number: ");
        int n = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(scanner.nextLine());


        }
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

    }
}
