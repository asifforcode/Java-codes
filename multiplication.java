import java.util.Scanner;

public class github {
    public static void main(String[] args) {

        //Write a program to print the multiplication table of a number N, entered by the user
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();

        for(int i=1;i<=10;i++){
            System.out.println(num+"*"+i+"="+num*i);

        }
    }
}



