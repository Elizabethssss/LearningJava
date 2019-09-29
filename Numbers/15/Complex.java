public class Complex {
    public static void main(String[] args) {
	System.out.println("Complex Number Algebra");
        ComplexNumbers c1 = new ComplexNumbers(3, 2);
        ComplexNumbers c2 = new ComplexNumbers(5, 7);
        System.out.println("Addition: " + c1.ComplexAdd(c2));
        System.out.println("Subtraction: " + c1.ComplexSub(c2));
        System.out.println("Negation c1: |z^2| = " + c1.ComplexNeg());
        System.out.println("Negation c2: |z^2| = " + c2.ComplexNeg());
        System.out.println("Inversion c1: " + c1.ComplexInv());
        System.out.println("Inversion c2: " + c2.ComplexInv());
        System.out.println("Multiplication: " + c1.ComplexMult(c2));
        System.out.println("Division: " + c1.ComplexDiv(c2));

    }
}
