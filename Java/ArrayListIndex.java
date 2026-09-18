package Java;
import java.util.*;

public class ArrayListIndex {
    public static void main(String[] args){
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("orange");
        /*
        找得到 → 回傳索引
        找不到 → 回傳 -1 
        */
        System.out.println(fruits.indexOf("apple"));         // 1
        System.out.println(fruits.indexOf("orange"));        // 2
        System.out.println(fruits.indexOf("watermelon"));    // 1

        fruits.add(1, "watermelon");
        System.out.println(fruits.indexOf("watermelon"));    // 1
        System.out.println(fruits.indexOf("apple"));         // 2
        System.out.println(fruits.indexOf("orange"));        // 3


        ArrayList<String> letters = new ArrayList<>();
        letters.add("A");
        letters.add("B");
        letters.add("C");

        System.out.println(letters);
        System.out.println(letters.indexOf("B"));
        letters.add(1, "X");
        System.out.println(letters);

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println(numbers);
        System.out.println(numbers.indexOf(30));
        numbers.remove(2);
        System.out.println(numbers);
    }
}
