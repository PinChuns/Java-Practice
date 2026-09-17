public class CompareString {
    public static void main(String[] args){
        String name = "Linda";
        // 字串不能用 == 比較內容，需使用equals()
        if(name.equals("Amy")){
            System.out.println("名字正確");
        }else{
            System.out.println("名字錯誤");
        }
    }
}
