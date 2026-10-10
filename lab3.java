import java.util.Scanner;

public class lab3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Please enter the customer type (0, 1, 2):");
        int customerType = s.nextInt();

        int creditLimit;
        if (customerType == 0) {
            creditLimit = 1000;
        } else if (customerType == 1) {
            creditLimit = 5000;
        } else {
            creditLimit = 250;
        }

        System.out.println("Enter a value for your past Purchase:");
        int pastPurchase = s.nextInt();

        System.out.println("Enter total price of items you are purchasing now:");
        int currentPurchase = s.nextInt();

        System.out.println("Please enter the payback amount:");
        int payBackAccount = s.nextInt();

        int currentCreditLimit = creditLimit - pastPurchase + payBackAccount - currentPurchase;

        if (currentCreditLimit <= 0) {
            System.out.println("Credit limit exceeded");
        } else {
            System.out.println("Customer can continue shopping.");
        }
    }
}