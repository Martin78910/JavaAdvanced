import java.util.Arrays;
import java.util.Scanner;

public class StringArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = {"Pesho","Gosho","Tosho"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
    }
}
