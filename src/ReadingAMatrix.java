import java.util.Scanner;

public class ReadingAMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < rows; row++) {

            for (int column = 0; column < cols; column++) {
                matrix[row][column] =
                        Integer.parseInt(scanner.next());
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }


    }
}
