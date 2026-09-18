package Java;

public class ChangesTest {
    public static void main(String[] args){
        int money = 18;
        int count = 0;

        while(money>=10){
            money = money-10;
            count++;
        }
        while(money>=5){
            money = money-5;
            count++;
        }
        while(money>=1){
            money = money-1;
            count++;
        }
        System.out.println(count);
    }
}
