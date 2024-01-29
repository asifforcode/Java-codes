public class reverse_Array {

    // reverse array
    public static void reverseArray(int number[]){
        int start=0;
        int end=number.length-1;

        while (start<end){
            //swap
            int temp=number[end];
           number [end] =number[start];
            number [start]=temp;

            start++;
            end--;
        }
    }
    public static void main(String[] args) {


        int number[]={2,8,3,12,14};
        reverseArray(number);
        for(int i=0;i<number.length;i++){
            System.out.print(" "+number[i]);
        }
    }
}
