import java.util.ArrayList;
import java.util.Scanner;

class Process {
    private Scanner in = new Scanner(System.in);
    private int n;

    void process() {
        System.out.println("Happy Numbers");
        System.out.print("Enter n: ");
        n = in.nextInt();
        findEightHappyNumbers(n);
    }
    private void findEightHappyNumbers(int n) {
        int count = 0;
        while(count < 8) {
            if(isHappy(n)) {
                System.out.println(n);
                count++;
            }
            n++;
        }
    }
    private boolean isHappy(int n) {
        ArrayList<Integer> history = new ArrayList<>();
        while(n != 1) {
            history.add(n);
            int sum = 0;
            while (n != 0) {
                sum += Math.pow(n%10, 2);
                n /= 10;
            }
            n = sum;
            if(history.contains(n))
                return false;
        }
        return true;
    }
}
