package Java;

public class FindPrimeNumber {
    //找出1~10中的質數
    public static boolean isPrime(int n){
        if(n<2){
            return false;    
        }
        for(int i=2; i<n; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        for(int n=1; n<=10; n++){
            if(isPrime(n)){
                System.out.println(n);
            }
        } 
    }
}
