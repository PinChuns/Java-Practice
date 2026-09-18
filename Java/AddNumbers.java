package Java;
import java.util.*;

public class AddNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter an Interge:");
        int number = scanner.nextInt();
        int sum = 0;

        for(int i=1; i<=number; i++){
        sum=sum+i;
        }
        System.out.println(sum);
    }
}
