package Java;
import java.util.*;

public class PrintNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入一個整數：");
        int number = scanner.nextInt();

        for(int i=1; i<=number; i++){
            System.out.println(i);
        }

    }
    
}
