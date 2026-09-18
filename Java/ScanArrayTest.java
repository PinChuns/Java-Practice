package Java;
import java.util.*;

public class ScanArrayTest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("起輸入陣列要包含幾個數字: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        for(int i=0; i<numbers.length; i++){
        System.out.print("第 " + (i + 1) + " 個數字：");
        numbers[i] = scanner.nextInt();
        }

        for(int i=0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }

        int max = numbers[0];
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]>max){
                max = numbers[i];
            }
        }
        System.out.println(max);

        int sum = 0;
        for(int i=0; i<numbers.length; i++){
            sum=sum+numbers[i];
            }
        System.out.println(sum);
    }
}
