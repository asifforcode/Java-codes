import java.util.ArrayList;

public class arraylistExp {
    public static void main(String[] args) {
        // synatx of arraylist
        ArrayList<Integer>list=new ArrayList<>();
        // adding elements in the list
        list.add(1);
        list.add(5);
        list.add(7);
        list.add(79);
        list.add(12);
        list.add(22);
        list.add(67);
//        System.out.println(list);

        // get operation (by index)
        int element=list.get(1);
//        System.out.println(element);

        // remove operation (by index)
        list.remove(2);
//        System.out.println(list);

        // set element

        list.set(0,90);
//        System.out.println(list);

//         conatains element (specific elemnt is exist or not )
//        System.out.println(list.contains(4));
//        System.out.println(list.contains(22));

        // add any element on specific index
        list.add(4,54);
//        System.out.println(list);

        // size of arraylist
//        System.out.println(list.size());

        // itarating (printing of array list)
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
    }
}
