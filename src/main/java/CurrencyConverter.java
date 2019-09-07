
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        final int rate = 23000;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the amount of dollar: ");
        double usd = scanner.nextDouble();
        double vnd = usd * rate;
        System.out.println(usd + " USD is: " + vnd + " VND");
    }
}
