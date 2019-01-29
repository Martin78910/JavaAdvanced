import java.util.*;

public class CreatingHashMap {
    public static void main(String[] args) {
        HashMap<String, ArrayList<Integer>> grades = new HashMap<>();
        grades.put("Peter", new ArrayList<>(Arrays.asList(5)));
        grades.put("Georgi", new ArrayList<>(Arrays.asList(5,5,6)));
        grades.put("Maria", new ArrayList<>(Arrays.asList(5,4,4,4,6)));
        grades.put("Tosho", new ArrayList<>(Arrays.asList(5,3,3,3,2)));
        grades.put("Ivan", new ArrayList<>(Arrays.asList(5,2,2,2,2,2)));
        for(String key:grades.keySet()){
            System.out.println(""+key+"->" + grades.get(key));
        }

        System.out.println(grades.size());
        System.out.println(grades.keySet());
        System.out.println(grades.values());
    }
}
