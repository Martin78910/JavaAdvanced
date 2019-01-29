import java.util.Arrays;
import java.util.Scanner;

public class StringArray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter an integer number: ");
        int n = Integer.parseInt(scanner.nextLine());
        String[] names = new String[n];
        for (int i = 0; i < names.length; i++) {
            names[i] = scanner.nextLine();


        }
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

    }
}
