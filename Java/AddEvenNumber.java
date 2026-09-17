import java.util.*;

public class AddEvenNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入一個數字：");
        int num = scanner.nextInt(); 
        int sum=0;

        for (int i=1; i<num; i++){
            if(i%2 == 0){
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
