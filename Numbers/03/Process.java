import java.util.Scanner;

import static java.lang.Math.sqrt;

class Process {
    private Scanner in = new Scanner(System.in);
    private String n = "";
    private int primeNum = 2;

    void process() {
        System.out.println("Find next prime number");
        answer();
        in.close();
    }
    private void answer() {
        while (n != null) {
            System.out.println("Do you want find next prime number?");
            System.out.print("Enter yes or no: ");
            n = in.next();
            if(n.equals("yes")) {
                prime(primeNum);
                primeNum++;
            }
            else if(n.equals("no"))
                break;
        }
    }

    private boolean isPrime(int n) {
        for (int i = 2; i <= sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    }

    private void prime(int n){
        while(!isPrime(primeNum))
            primeNum++;
        System.out.println(primeNum);
    }
}
