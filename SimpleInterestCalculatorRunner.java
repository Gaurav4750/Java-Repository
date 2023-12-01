import SimpleInterestCalculator;
import java.math.BigDecimal;
import java.util.*;

public class SimpleInterestCalculatorRunner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal amount: ");
        String principal = sc.nextLine();
        System.out.println("Enter the interest percentage: ");
        String interest = sc.nextLine();
        SimpleInterestCalculator calculator = new SimpleInterestCalculator(principal, interest);
        System.out.println("Enter the No of years: ");
        int noOfYears = sc.nextInt();
        BigDecimal totalValue = calculator.calculateTotalValue(noOfYears);
        System.out.println("Total Value: "+totalValue);
    }
}