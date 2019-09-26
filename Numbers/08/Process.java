import java.util.Scanner;

class Process {
    private Scanner in = new Scanner(System.in);
    private double firstNum, secondNum;
    private String op;

    void process() {
        System.out.println("Calculator");
        System.out.print("Enter first number: ");
        firstNum = in.nextDouble();
        System.out.print("Enter second number: ");
        secondNum = in.nextDouble();
        System.out.print("Enter operation (+, -, *, /): ");
        op = in.next();
        System.out.println(firstNum + " " + op + " " + secondNum + " = " + calculate(firstNum, secondNum, op));
    }

    private double calculate(double a, double b, String op) {
        switch (op) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                if(b == 0) {
                    System.out.println("Error! Dividing by zero.");
                    break;
                }
                return a / b;
        }
        return 0;
    }
}
