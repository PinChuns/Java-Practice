package Java;
import java.util.*;

public class SCTest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入1至7,其中一個整數: ");
        int day = scanner.nextInt();

        switch(day){
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期日");
                break;
            default:
                System.out.println("輸入錯誤");
        }
    }
}
