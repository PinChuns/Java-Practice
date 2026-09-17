public class GetMax {
    public static int max(int a, int b){
        if (a > b){
            return a;
        }else{
            return b;
        }
    }
    
    public static void main(String[] args) {
        int result = max(3, 8);
        System.out.println(result);
    }
}
