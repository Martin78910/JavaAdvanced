import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListOfIntegers {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>(Arrays.asList(5,1,3,9,25,101));
        nums.add(2500);
        System.out.println(nums);
        Collections.sort(nums);
        System.out.println(nums);
        System.out.println(nums.get(5));
        nums.remove(0);
        System.out.println(nums);
        nums.set(0,8765);
        System.out.println(nums);



    }
}
