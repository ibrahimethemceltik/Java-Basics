import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter vehicle class code (0-4): ");
        int code = sc.nextInt();

        System.out.print("Enter number of hours: ");
        int hours = sc.nextInt();

        String vehicleClass = "";
        int fee = 0;

        switch (code) {
            case 0:
                vehicleClass = "Bicycle";
                if (hours <= 1) {
                    fee = 5;
                } else {
                    fee = 5 + (hours - 1) * 1;
                }
                break;

            case 1:
                vehicleClass = "Motorbike";
                if (hours <= 1) {
                    fee = 5;
                } else {
                    fee = 5 + (hours - 1) * 1;
                }
                break;

            case 2:
                vehicleClass = "Automobile";
                if (hours <= 1) {
                    fee = 7;
                } else {
                    fee = 7 + (hours - 1) * 3;
                }
                break;

            case 3:
                vehicleClass = "Minibus";
                if (hours <= 1) {
                    fee = 10;
                } else {
                    fee = 10 + (hours - 1) * 8;
                }
                break;

            case 4:
                vehicleClass = "Truck";
                fee = 10 * hours;
                break;

            default:
                System.out.println("Invalid class code");
                return;
        }

        System.out.println("Vehicle class: " + vehicleClass);
        System.out.println("# of hours: " + hours + " hours");
        System.out.println("Parking fee: " + fee + " $");
    }
}