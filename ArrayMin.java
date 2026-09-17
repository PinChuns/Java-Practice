public class ArrayMin {
    public static void main(String[] args){
        int [] numbers={33, 26, 58, 97};
        int min = numbers[0];

        for(int i=0; i<numbers.length; i++){
            if(numbers[i]<min){
                min = numbers[i];
            }
        }
        System.out.println(min);

        int sum = 0;
        for(int i=0; i<numbers.length; i++){
            sum = sum + numbers[i];
        }
        System.out.println(sum);

        double ave = (double) sum/numbers.length;
        int aveg = sum/numbers.length;
        System.out.println(ave);
        System.out.println(aveg);
    }
}
