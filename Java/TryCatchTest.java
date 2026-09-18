package Java;

public class TryCatchTest {
    public static void main(String[] args){
        try{
            int n = 10/0;
            System.out.println('A');
        }catch(Exception e){
            System.out.println("發生錯誤");
        }

        /*  try：嘗試執行
            catch：發生錯誤時執行
            finally：最後通常都會執行  */

        try {
            int a = 10 / 0;
        }catch (Exception e) {
            System.out.println("發生錯誤");
        }finally {
            System.out.println("一定會執行");
        }
    }
}
