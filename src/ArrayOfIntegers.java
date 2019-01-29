import java.util.Arrays;
import java.util.Scanner;

public class ArrayOfIntegers {
    public static void main(String[] args) {
        int [] arr = new int[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i]=i+1;


        }
        System.out.println(Arrays.toString(arr));
            
        }

    }


