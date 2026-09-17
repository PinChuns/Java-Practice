import java.util.*;

public class StringInputTest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入一個句子:");
        String text = scanner.nextLine();

        String[] word = text.replace(",", "").replace(".", "").split(" ");

        for(int i=word.length-1; i>=0; i--){
            System.out.println(word[i]);
        }
    }
}
