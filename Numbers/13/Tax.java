import java.util.Scanner;

public class Tax {
        Scanner in = new Scanner(System.in);
        double cost, tax;
        System.out.println("Tax Calculator");
        System.out.print("Enter the cost: ");
        cost = in.nextDouble();
        System.out.print("Enter country tax: ");
        tax = in.nextDouble();
        System.out.println("Total cost is " + (cost + cost*tax/100));
    }
}
