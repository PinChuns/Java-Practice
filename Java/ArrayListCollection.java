package Java;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListCollection {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(50);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);

        Collections.sort(numbers);
        System.out.println(numbers);
        System.out.println(Collections.max(numbers));    //find the max number
        System.out.println(Collections.min(numbers));    //find the min number
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println(numbers);
    }
}
