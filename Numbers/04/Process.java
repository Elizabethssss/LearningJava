import java.util.ArrayList;
import java.util.Scanner;

class Process {
    private Scanner in = new Scanner(System.in);
    private double n, cost, m;
    private int primeNum = 2;
    private ArrayList<String> result = new ArrayList<>();

    void process() {
        System.out.println("Calculate the total cost of tile to cover W x H floor");
        System.out.print("Enter the cost: ");
        cost = in.nextDouble();
        System.out.println("Enter length and width: ");
        n = in.nextDouble();
        m = in.nextDouble();
        System.out.println("The total cost is " + totalCost(cost, n, m) + " for " + totalCost(1, n, m) + " square floor.");
        in.close();
    }

    private double totalCost(double cost, double n, double m) {
        return cost*n*m;
    }

}
