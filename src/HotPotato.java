import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] children = scanner.nextLine().split("\\s+");
        int n = Integer.valueOf(scanner.nextLine());
        Deque<String> queue = new ArrayDeque<>();
        for(String child:children){
            queue.offer(child);
            while (queue.size()>1){
                for (int i = 0; i < n; i++) {
                    queue.offer(queue.poll());

                }
                System.out.println("Removed " + queue.poll());

            }
            System.out.println("Last is " + queue.poll());
        }

    }
}
