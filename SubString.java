public class SubString {
    // substring function
    public static String sub_string(String word, int si, int ei){
        String substr="";
        for(int i=si; i<ei;i++ ){
            substr+=word.charAt(i);

        }
        return substr;
    }

    public static void main(String[] args) {
        String word="Hello world";
        int si=0;
        int ei=5;
        //System.out.println(word.substring(0,5)); pre defined function for substring in java
        System.out.println(sub_string(word,si,ei));

    }
}
