import java.util.Scanner;

class Process {
    void process() {
        Scanner in = new Scanner(System.in);
        int n;
        double num;
        System.out.println("Find n Fibonachi number");
        System.out.print("Enter n: ");
        n = in.nextInt();
        if(n > 50)
            n = 50;

        System.out.println(fibb(n));
        in.close();
    }
    private long fibb(int n){
        long f0 = 0, f1 = 1;
        if(n == 0)
            return f0;
        if(n == 1)
            return f1;

        for (int i = 2; i < n; i++) {
            long t = f0;
            f0 = f1;
            f1 += t;
        }
        return  f1;
    }
}
