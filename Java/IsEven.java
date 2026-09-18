package Java;
import java.util.*;

public class IsEven {
    public static boolean even(int a){
        if(a % 2 == 0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        /*
        boolean c = even(4);
        System.out.println(c);
        boolean d = even(11);
        System.out.println(d);
        */
        Scanner s = new Scanner(System.in);
        System.out.println("請輸入一個整數：");
        int number = s.nextInt();
        boolean e = even(number);
        System.out.println(e);

    }
}
