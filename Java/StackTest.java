package Java;
import java.util.*;

//Stack: Last In, First Out. 後進先出（LIFO）

public class StackTest {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();

        //push()放進資料
        stack.push(40);
        stack.push(60);
        stack.push(20);
        stack.push(10);
        stack.push(50);

        //pop()取資料
        System.out.println(stack.pop());         // 50 "pop()會取出並刪除最上面的元素"
        System.out.println(stack.pop());         // 10

        //peek()查看最上面的元素，但不刪除
        System.out.println(stack.peek());

        //isEmpty()判斷 Stack 是否為空
        System.out.println(stack.isEmpty());     //false

        //size()查看元素數量
        System.out.println(stack.size());

        //search()用來尋找元素的位置
        System.out.println(stack.search(20));   //1 最上面是1
        System.out.println(stack.search(40));   //3
        System.out.println(stack.search(10));   //-1 找不到會回傳-1
    }
}
