import java.util.Scanner;
public class Main {
public static void main(String[]args) {


    Scanner scanner = new Scanner(System.in);

    System.out.println("Please enter a distance:");
    int distance = scanner.nextInt();
    System.out.println("please enter a fuel value:");
    int fuel = scanner.nextInt();

    double fuelConsumption = (double) fuel * 100 /distance;
            System.out.printf("Fuel consumption: %.2f L/100 km%n",fuelConsumption);

    System.out.printf("Hello %s | Day: %03d | Month: %03d | Score: %07.2f | ID: %0,7d","SE 115",13,1,87.50,2123);

    }
}
