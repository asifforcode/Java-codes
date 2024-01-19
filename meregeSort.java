public class meregeSort {

    public static void display(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");

        }
    }
    // merge sort code
    public static void mergesort(int arr[], int si, int ei){
        // Base case
        if(si>=ei){
            return;

        }
        // kaam
        int mid=si+(ei-si)/2;
        mergesort(arr,si, mid); // Left part
        mergesort(arr, mid+1, ei); // Right part
        merge(arr, si, mid, ei);

    }

   public static void merge(int arr[], int si, int mid , int ei){
        // left(0,3)=4 Right (4,6)=3 ->6-0+1
        int temp[]=new int[ei-si+1];
        int i=si; // iterator for left part
        int j=mid+1; // iterator for right part
       int k=0;      // itertaor for temp arr

       while(i<=mid && j<=ei) {
           if (arr[i] < arr[j]) {
               temp[k] = arr[i];
               i++;
               k++;

           } else {
               temp[k] = arr[j];
               j++;
               k++;
           }
       }
           // left part for remaining elemnts
           while(i<=mid){
               temp[k++]=arr[i++];
           }
           // right part for remaning elemnents
           while(j<=ei){
               temp[k++]=arr[j++];
           }
           // copy temp arr to original arr
           for(k=0, i=si; k< temp.length; i++, k++ ){
               arr[i]=temp[k];
           }



   }

    public static void main(String[] args) {

        int arr[]={6,3,9,5,2,8,1};
        mergesort(arr,0, arr.length-1);
        display(arr);
    }
}
