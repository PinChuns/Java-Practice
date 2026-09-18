package Java;
import java.util.*;

//Queue: First in, First out. 先進先出

public class QueueTest {
    public static void main(String[] args){
        Queue<Integer> queue = new LinkedList<>();

        //offer()加入資料
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        System.out.println(queue);

        //poll()取出資料並移除資料
        System.out.println(queue.poll());    // 10
        System.out.println(queue.poll());    // 20

        //peek()查看且不會移除資料
        System.out.println(queue.peek());
        System.out.println(queue.size());
    }
    
}
