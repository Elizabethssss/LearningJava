import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Math.sqrt;

class Process {
    private Scanner in = new Scanner(System.in);
    private int n;
    private int primeNum = 2;
    private ArrayList result = new ArrayList();

    void process() {
        System.out.println("Find all Prime Factors (if there are any)");
        System.out.print("Enter n: ");
        n = in.nextInt();
        if(isPrime(n))
            System.out.println(n);
        else
            prime(n);
        in.close();
    }

    private boolean isPrime(int n) {
        for (int i = 2; i <= sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    }

    private void prime(int n){
        for(int i = 2; i <= n; i++) {
            int count = 0;
            if(isPrime(i) && n % i == 0) {
                while (n % i == 0) {
                    n /= i;
                    count++;
                }
                result.add(i + "^" + count);
            }
        }
        System.out.println(result);
    }
}
