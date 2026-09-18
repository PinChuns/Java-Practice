package Java;
import java.util.*;

public class WhileTest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入一個數字：");
        int number = scanner.nextInt();
        int i = 1;
        
        while (i <= number) {
            System.out.println(i);
            i++;
        }
        
    }
    
}
