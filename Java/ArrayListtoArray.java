package Java;

import java.util.ArrayList;

public class ArrayListtoArray {
    public static void main(String[] args){
    
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        String[] arr = fruits.toArray(new String[0]);
        System.out.println(arr[0]);
    }
}
