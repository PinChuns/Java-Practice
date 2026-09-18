package Java;
import java.util.*;

public class ArrayListTest {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println(numbers);

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println(numbers);
        numbers.remove(1);
        System.out.println(numbers);
        System.out.println(numbers.size());
        System.out.println(numbers.get(0));

        ArrayList<String> programming = new ArrayList<>();
        programming.add("Java");
        programming.add("C++");
        programming.add("Python");
        programming.add("C");
        System.out.println(programming.size());

        for (int i=0; i<programming.size(); i++){
            System.out.println(programming.get(i));
        }
        //Enhanced for loop
        for (String language : programming) {
        System.out.println(language);
        }
    }
}
