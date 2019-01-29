import java.util.ArrayDeque;
import java.util.Deque;

public class Stack {
    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();
        boolean isEmpty = stack.isEmpty();
        boolean exists = stack.contains(2);
        int size =stack.size();
        stack.push(10);
        System.out.println(isEmpty);
        System.out.println(exists);
        System.out.println(size);
        System.out.println(stack);
    }
}
