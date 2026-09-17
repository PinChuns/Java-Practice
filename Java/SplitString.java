public class SplitString {
    public static void main(String[] args){
        String text = "I am Leo";
        String[] diff = text.split(" ");
        
        for(int i=0; i<diff.length; i++){
            System.out.println(diff[i]);
        }

        for(int i=diff.length-1; i>=0; i--){
            System.out.println(diff[i]);
        }
    }
}
