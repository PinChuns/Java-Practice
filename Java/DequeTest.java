package Java;
import java.util.*;

public class DequeTest {
    public static void main(String[] args){
        Deque<Integer> deque = new ArrayDeque<>();

        //加入資料
        deque.addFirst(1);          // 從前端加入
        deque.addLast(2);           // 從後端加入
        deque.addLast(3);
        deque.addFirst(8);
        System.out.println(deque);    // 前端->[8, 1, 2, 3]<-後端

        //取出並移除資料
        System.out.println(deque.removeFirst());    // 8
        System.out.println(deque.removeLast());     // 3

        //查看資料且不會移除資料
        System.out.println(deque.peekFirst());     // 1
        System.out.println(deque.peekLast());      // 2
        System.out.println(deque.size());


    }
}
