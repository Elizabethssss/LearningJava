import java.util.Scanner;

class Process {
    private Scanner in = new Scanner(System.in);
    private int n;
    private int steps = 0;

    void process() {
        System.out.println("Collatz Conjecture");
        System.out.print("Enter n: ");
        n = in.nextInt();
        while(n > 1) {
            n = collatz(n);
        }
        System.out.println("You need " + steps + " to make n <= 1");
    }
    
    private int collatz(int n){
        if(n % 2 == 0)
            n /= 2;
        else
            n = n * 3 + 1;
        steps++;
        return n;
    }
}
