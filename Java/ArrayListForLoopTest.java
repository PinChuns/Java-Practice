package Java;
import java.util.*;

public class ArrayListForLoopTest {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        
        for(int i=0; i<numbers.size(); i++){
            System.out.println(numbers.get(i));
        }

        ArrayList<Integer> scores = new ArrayList<>();

        scores.add(85);
        scores.add(72);
        scores.add(90);
        scores.add(100);
        scores.add(82);
        scores.add(90);

        for(Integer score: scores){
            System.out.println(score);
        }

        int max=scores.get(0);
        for(Integer score:scores){
            if(score>max){
                max = score;
            }
            System.out.println(max);
        }

        int sum = 0;
        float avg = 0;
        for(Integer score: scores){
            sum = sum+score;
            avg = (float)sum / scores.size();
        }
        System.out.println(avg);

    }
    
}
