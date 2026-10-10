import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Sold count for Item 1 (239.99$): ");
        int item1 = sc.nextInt();

        System.out.print("Sold count for Item 2 (129.75$): ");
        int item2 = sc.nextInt();

        System.out.print("Sold count for Item 3 (99.95$): ");
        int item3 = sc.nextInt();

        System.out.print("Sold count for Item 4 (350.89$): ");
        int item4 = sc.nextInt();

        double totalSales = (item1 * 239.99) + (item2 * 129.75) + (item3 * 99.95) + (item4 * 350.89);

        double komisyonOrani;
        if (totalSales < 1000) {
            komisyonOrani = 0.09;
        } else if (totalSales < 3000) {
            komisyonOrani = 0.12;
        } else {
            komisyonOrani = 0.15;
        }

        double weeklyEarnings = 200.0 + (totalSales * komisyonOrani);

        System.out.println("Total Sales: " + totalSales + " $");
        System.out.println("Weekly Earnings: " + weeklyEarnings + " $");
    }
}