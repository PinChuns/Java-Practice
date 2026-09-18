package Java;
public class ArrayMax {
    public static void main(String[] args){
        int [] numbers={33, 26, 58, 97};
        int max= numbers[0];

        for(int i=0; i<numbers.length; i++){
            if(numbers[i]>max){
                max = numbers[i];
            }
        }
        System.out.println(max);
    }
    
}
