public class ReplaceString {
    public static void main(String[] args){
        String text = "I, am Leo.";
        // 原本字串.replace("要被換掉的內容", "換成什麼");
        // 第二個字串是空的 ""，意思就是移除。
        String diff = text.replace(",", "").replace(".","");
        System.out.println(diff);
    }
}
