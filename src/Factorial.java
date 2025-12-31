public class Factorial {
        int countFact(int n){
            int fact=1;
            for(int i=1;i<=n; i++ ) {
                fact *= i;
            }
            return fact;
        }
    public static void main(String[] args){
            Factorial f= new Factorial();
            System.out.println(f.countFact(6));
    }


}
