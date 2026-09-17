public class DataTypeOperator {
    public static void main(String[] args){
        //算術運算
        int x=3+4;
        System.out.println(x);
        int y=3/4;
        System.out.println(y);
        double z=3/4.0;    //浮點數除法，前面不可以用int
        System.out.println(z);
        int v=5+(3/4);
        System.out.println(v);
        double p=5%3.5;
        System.out.println(p);
        //指定運算
        int h=5;
        h=h+2;
        System.out.println(h);
        int j=3;
        j+=2;  //j=j+2
        j*=3;  //j=j*3
        System.out.println(j);
        //比較運算
        //int a=3>5;  //錯誤，比較運算的型態應該是boolean
        boolean a=3>5;
        boolean b=3<4;
        boolean c=5<=5;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        boolean d=2==2;
        boolean e=2!=2;
        System.out.println(d);
        System.out.println(e);
        boolean f="Hello"=="Hello";  //可用於字串比較
        boolean g="Hello"=="hello";  
        System.out.println(f);
        System.out.println(g);
        //單元運算
        int i=4;
        i++;
        System.out.println(i);  //5
        i--;
        System.out.println(i);  //4
        boolean k=!true;
        System.out.println(k);  //false
        //邏輯運算
        boolean l=true&&true;
        System.out.println(l);  //true
        boolean m=true||false;
        System.out.println(m);  //true
        boolean n=false||false;
        System.out.println(n);  //false
    }
}
