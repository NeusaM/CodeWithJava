import  java.util.Scanner;
public class CompoundIC {
    public static void main(String[] args) {
        // Compund interest calculator
        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        rate = scanner.nextDouble() / 100;

        System.out.print("Enter the number of times compounded per year: ");
        timesCompounded = scanner.nextInt();

        System.out.print("Enter the number of years: ");
        years = scanner.nextInt();

        amount = principal*Math.pow(1 + rate / timesCompounded, timesCompounded * years);
        System.out.printf("The amount after %d is €%.2f ", years, amount);




    }
}
