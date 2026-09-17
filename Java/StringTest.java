public class StringTest {
    public static void main(String[] args){
        String st="Hello";
        /*
        System.out.println(st.length());
        System.out.println(st.charAt(0));
        System.out.println(st.charAt(4));
        */
        for(int i=0; i<st.length(); i++){
            System.out.println(st.charAt(i));
        }
        int count = 0;
        for(int i=0; i<st.length(); i++){
            if(st.charAt(i) == 'l'){
                count=count+1;
            }
        }
        System.out.println(count);
    }
}
