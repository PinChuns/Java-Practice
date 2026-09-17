public class GetMin {

    public static int min(int a, int b){

        if(a < b){
            return a;
        }else{
            return b;
        }

    }
    public static void main(String[] args){
        int m = min(8, 3);
        System.out.println(m);

    }
    
}
