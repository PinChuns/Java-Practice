package Java;
public class DataTypeVariable{
    public static void main(String[] args){
        //整數，預設是int型態
        int x;
        x = 3;
        System.out.println(x);
        x = 120;
        System.out.println(x);      //變數值可以被改變，後宣告的會覆蓋前面宣告的
        System.out.println(3);
        System.out.println(120);

        //長整數，數字後面個別加上L
        long y = 2000000000000L;
        System.out.println(y);
        
        //浮點數，預設為double型態
        double m = 3.14159268;
        System.out.println(m);
        
        //單精度浮點數（精準度到小數點7位），數字後面特別加上F
        float n = 3.14159268F;
        System.out.println(n);
        System.out.println(3.14159268F);      // 3.1415927
        
        //布林值
        boolean b;
        b = true;
        System.out.println(b);
        
        //字元
        char c = 'n';
        System.out.println(c);
        System.out.println('a');
        // System.out.println('ab'); Error
        
        //字串
        String s = "Hello, Java";
        System.out.println(s);
        System.out.println("Hello, Java");
    }
}