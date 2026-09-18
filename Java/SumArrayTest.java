package Java;
public class SumArrayTest{
    public static void main(String[] args){
        int [] numbers={33, 26, 58, 97};
        int sum = 0;

        for(int i=0; i<numbers.length; i++){
            sum = sum+numbers[i];
        }
        System.out.println(sum);
    }
}