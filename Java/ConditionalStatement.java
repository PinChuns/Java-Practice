package Java;
import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args){
        //使用標準輸入（從終端機輸入資料）
        
        Scanner s=new Scanner(System.in);
        System.out.println("請輸入一個整數：");
        int x=s.nextInt();
        System.out.println(x*10);
        
        //if判斷式
        Scanner m=new Scanner(System.in);
        System.out.println("請問你想要多少錢？");
        int money=m.nextInt();
        if(money>100000){
            System.out.println("太多了，不能領！");
        }else if(money>=100){
            System.out.println("OK，錢在這裡！");
        }else{
            System.out.println("太少了，不能領！！");
        }
        
        //switch判斷式
        int n1=3;
        int n2=4;
        System.out.println("請輸入想要做的運算（+ - * /）");
        Scanner  q=new Scanner(System.in);
        String op=q.next();
        System.out.println("使用者輸入的運算符號");
        System.out.println(op);
        switch(op){
            case "+":
                System.out.println(n1+n2);
                break;
            case "-":
                System.out.println(n1-n2);
                break;
            case "*":
                System.out.println(n1*n2);
                break;
            case "/":
                System.out.println(n1/n2);
                break;
            default:
                System.out.println("不支援運算符號");
                break;
        }
    } 
}
