package Java;
import java.util.*;

public class WhileAddTest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入一個數字：");
        int number = scanner.nextInt();
        int i = 1;
        int sum = 0;
        while(i <= number){
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
    }   
}
