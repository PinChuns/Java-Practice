package Java;
import java.util.*;

// !!!HashMap 不保證資料的排列順序，所以輸出順序可能不同。
public class HashMapTest {
    public static void main(String[] args){
    
        // HashMap用來儲存鍵(key)和數值(value)的配對
        HashMap <String, Integer> scores = new HashMap<>();
        // String是key的型別, Integer是Value的型別

        // put()放入資料, get()讀取資料, 修改資料再次使用put()
        scores.put("Tom", 85);
        scores.put("Mary", 90);
        System.out.println(scores);                    //{Tom=85, Mary=90}
        scores.put("Tom", 95);
        System.out.println(scores);                    //{Tom=95, Mary=90}
        System.out.println(scores.get("Tom"));    //95

        //檢查是否包含某一個key
        System.out.println(scores.containsKey("Tom"));      //true
        System.out.println(scores.containsKey("John"));     //false

        System.out.println(scores.size());

        //.keySet()取得所有key
        System.out.println(scores.keySet());             //[Tom, Mary]

        for (String key : scores.keySet()) {
        System.out.println(key + ":" + scores.get(key));
        }

        HashMap<String, Integer> map = new HashMap<>();

        map.put("A", 10);
        map.put("B", 20);

        System.out.println(map.size());     // 2
        System.out.println(map.isEmpty());  // false
    }
}
