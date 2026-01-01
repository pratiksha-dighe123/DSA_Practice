public class Factorial {
        int countFact(int n){
            int fact=1;
            for(int i=1;i<=n; i++ ) {
                fact *= i;
            }
            return fact;
        }

        int nCr(int n, int r){
            int fact_n = countFact(n);
            int fact_r = countFact(r);
            int fact_nmr = countFact(n-r);

            return fact_n / (fact_r * fact_nmr);
        }

    public static void main(String[] args){
            Factorial f= new Factorial();
            System.out.println(f.nCr(8,2));
    }
}