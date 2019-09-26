import java.util.Scanner;

class Process {
    private Scanner in = new Scanner(System.in);
    private int sum, years;
    private double percent, monthly, temp;

    void process() {
        System.out.println("Mortgage Calculator");
        System.out.print("Enter the principal owed ($): ");
        sum = in.nextInt();
        System.out.print("Enter the mortgage rate (%): ");
        percent = in.nextDouble();
        System.out.print("Enter the length of the mortgage (years): ");
        years = in.nextInt();
        monthly = percent/12/100;
        temp = Math.pow((1+monthly), years*12);
        System.out.println(Math.ceil(sum*monthly*temp/(temp - 1)));
    }
}
