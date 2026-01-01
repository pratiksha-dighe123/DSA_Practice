public class Prime {
    static boolean isPrime(int num){
        if(num<=1) {
            return false;
        }
        for(int i=2; i <= num/2; i++){
            if(num%i == 0) {
                return false;

            }
        }
        return true;
    }

    public static void main(String[] args) {
        int num = 7;

        if (isPrime(num)) {
            System.out.println(num + " is a Prime number");
        } else {
            System.out.println(num + " is not a Prime number");
        }
    }
}
