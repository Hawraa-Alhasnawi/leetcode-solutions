public class numIsPrime {
    public static boolean numIsPrime(int n){

       // if(n <= 1) return false;
        if(n >= 2 ){

            for(int i = 2; i <= Math.sqrt(n); i++){
                if(n % i == 0) return false; // if n is divisible by any number other than 1 and itself, it is not prime
            }
            return true; // if no divisors were found, it is prime

        }
        return false; // if n is less than 2, it is not prime
    }
    public static void main(String[] args) {
        System.out.println(numIsPrime(5)); // true
        System.out.println(numIsPrime(4)); // false
        System.out.println(numIsPrime(1)); // false
        System.out.println(numIsPrime(2)); // true
        System.out.println(numIsPrime(3)); // true
    }
}
