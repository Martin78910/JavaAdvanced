import java.util.ArrayDeque;
import java.util.*;

public class Stack {
    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<Integer>();
        int size = stack.size();
        boolean isEmpty = stack.isEmpty();
        boolean exists = stack.contains(2);
        System.out.println(size);
        System.out.println(isEmpty);
        System.out.println(exists);
    }
}
