package Java;
import java.util.*;

public class DoWhileTest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num;

        do{
            System.out.println("輸入一個整數,輸入0則結束: ");
            num = scanner.nextInt();
            System.out.println("你輸入的數字是:" +num);
        }while(num != 0);
    }
}
