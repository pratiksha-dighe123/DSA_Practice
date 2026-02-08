public class SumDigit {

    int digSum(int num){
        int digitSum=0;

        while( num >0){
            int  lastDigit= num % 10;
            num= num /10;

            digitSum += lastDigit;
        }
        return digitSum;
    }

    public static void main(String[] args){
        SumDigit sm= new SumDigit();
        System.out.println("The sum is:");
        System.out.println(sm.digSum(2345));
    }

}
