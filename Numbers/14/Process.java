import java.util.Scanner;

class Process {
    private Scanner in = new Scanner(System.in);
    private int n;

    void process() {
        System.out.println("Factorial Finder");
        System.out.print("Enter n (0-25): ");
        n = in.nextInt();
        if(n<0 || n>25){
            System.out.println("Incorrect input!");
            return;
        }
        System.out.println("Recursive implementation: " + recursiveFact(n));
        System.out.println("Loop implementation: " + loopFact(n));
    }
    private long recursiveFact(int n) {
        if(n == 0)
            return 1;
        return n * recursiveFact(n-1);
    }
    private long loopFact(int n){
        if(n == 0)
            return 1;
        long result = n;
        for (int i = n - 1; i > 0; i--) {
            result *= i;
        }
        return result;
    }
}
