import java.util.Arrays;
import java.util.Scanner;

public class ArrayOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[]{1,2,3,4,0,15,21,96};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
