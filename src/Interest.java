import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        double money;
        int month;
        double interestRate;
        double totalInterest = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter investment money: ");
        money = sc.nextDouble();
        System.out.println("Enter the number of months: ");
        month = sc.nextInt();
        System.out.println("Enter annual interest rate in percentage: ");
        interestRate = sc.nextDouble();

        for (int i = 0; i < month; i++) {
            totalInterest = money * (interestRate / 100) / 12 * month;
        }

        System.out.println("Total of interest: " + totalInterest);
    }
}
