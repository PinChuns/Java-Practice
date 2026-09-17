public class DataTypeConversion {
    public static void main(String[] args){
        //數字型態間的轉換
        //數字型態範圍大小的排序：double > float > long > int > short > byte
        //小範圍轉到大範圍：自動轉換
        byte x = 3;
        int y = x;  //byte轉成int
        System.out.println(y);
        long z = y;  //int轉成long
        System.out.println(z);
        double d = z; //long轉成double
        System.out.println(d);
        
        //大範圍轉到小範圍：需要使用（資料型態）做強制轉換
        int a = 1024;
        //byte b = a;  //錯誤，試圖把int轉成byte
        byte b = (byte) a;
        System.out.println(b);
        long c = 102400;
        //int d = c;  //錯誤，試圖把long轉換成int
        int j = (int)c;
        System.out.println(j);
        //float f = 3.141592689;  //錯誤，試圖把double轉換成long
        float f = (float)3.141592689;  //3.1415927，失去精準度
        System.out.println(f);
        
        //字串轉換成數字
        String text = "34";
        int e = Integer.parseInt(text);
        System.out.println(e);
        text = "3.1415";
        double h = Double.parseDouble(text);
        System.out.println(h);
        
        //數字轉換成字串
        int g = 34;
        String s = String.valueOf(g);  //把int型態的34轉換成String型態的34
        System.out.println(g);
        long i = 999999;
        s = String.valueOf(i);
        System.out.println(s);
        s = String.valueOf(3.14159F);
        System.out.println(s);
    }
}
