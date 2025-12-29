import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter bill amount: ");
        double bill = sc.nextDouble();

        double discount = 0;

        if (bill > 1000) {
            discount = bill * 0.10; // 10% discount
        }

        double finalAmount = bill - discount;

        System.out.println("Discount: " + discount);
        System.out.println("Final Amount to Pay: " + finalAmount);
    }
}
