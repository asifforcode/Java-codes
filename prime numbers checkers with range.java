public class prime_using_function {

    public static boolean isprime(int num) {
        if(num==0){
            return true;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;


            }

        }
        return true;
    }
    // creating a function to find all primes numbers in a range
    public static void primerange(int n) {
        for (int i = 2; i<= n;i++ ) {
            if(isprime(i)){
                System.out.print(i+" ");

            }


        }
        System.out.println();
    }
    public static void main(String[] args) {
primerange(20);
    }
}
