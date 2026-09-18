package Java;

import java.util.ArrayList;

public class ArrayListContainandSet {
    public static void main(String[] args){

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("watermelon");

        System.out.println(fruits.contains("strawberry"));
        System.out.println(fruits.contains("apple"));

        fruits.set(1, "grape");    //[banana, grape, orange, watermelon]
        System.out.println(fruits);
        fruits.set(2, "watermelon");    //[banana, grape, watermelon, watermelon]
        System.out.println(fruits);

        //clear
        fruits.remove("watermelon");    //[banana, grape, watermelon] remove會移除第一個找到的相對應值
        System.out.println(fruits);
        fruits.clear();    //清除所有元素
        System.out.println(fruits);
        System.out.println(fruits.size());    //.size()查看元素數量

        //isEmpty
        System.out.println(fruits.isEmpty());    //true


    }
}
