import java.util.Scanner;

class Process {
    private Scanner in = new Scanner(System.in);
    private double cost = 0, amount = -1, diff, leftover;
    private int hundreds, fifties, twenties, tens, fives, ones, halfs, quarters, dimes, nickels, pennies;

    void process() {
        System.out.println("Change Return Program");
        while(diff >= 1000 || amount < cost) {
            System.out.print("Enter the cost: ");
            cost = in.nextDouble();
            System.out.print("Enter the amount of given money: ");
            amount = in.nextDouble();
            diff = amount - cost;
            if (diff >= 1000) {
                System.out.println("Overpayment - do you have any smaller bills?");
            }
            if(amount < cost)
                System.out.println("Not enough! " + amount + " is less than " + cost);
        }
        if(Math.abs(diff) < 0.01) {
            System.out.println("No change due - paid with exact change");
            return;
        }
        hundreds = (int) (diff / 100);
        leftover = diff - hundreds*100;
        fifties = (int) (leftover/50);
        leftover -= fifties*50;
        twenties = (int) (leftover/20);
        leftover -= twenties*20;
        tens = (int) (leftover/10);
        leftover -= tens*10;
        fives = (int) (leftover/5);
        leftover -= fives*5;
        ones = (int) (leftover);
        leftover -= ones;

        leftover *= 100;
        halfs = (int) (leftover/50);
        leftover -= halfs*50;
        quarters = (int) (leftover/25);
        leftover -= quarters*25;
        dimes = (int) (leftover/10);
        leftover -= dimes*10;
        nickels = (int) (leftover/5);
        leftover -= nickels*5;
        pennies = (int) (leftover + 0.5);

        System.out.println("Your change: ");
        if (hundreds > 0)
            System.out.println(hundreds + " hundreds");
        if (fifties > 0)
            System.out.println(fifties + " fifties");
        if (twenties > 0)
            System.out.println(twenties + " twenties");
        if (tens > 0)
            System.out.println(tens + " tens");
        if (fives > 0)
            System.out.println(fives + " fives");
        if (ones > 0)
            System.out.println(ones + " ones");
        if (halfs > 0)
            System.out.println(halfs + " halfs");
        if (quarters > 0)
            System.out.println(quarters + " quarters");
        if (dimes > 0)
            System.out.println(dimes + " dimes");
        if (nickels > 0)
            System.out.println(nickels + " nickels");
        if (pennies > 0)
            System.out.println(pennies + " pennies");
    }
}
