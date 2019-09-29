class ComplexNumbers {
    private double real;
    private double complex;
    private String r, c;

    ComplexNumbers(double real, double complex) {
        this.real = real;
        this.complex = complex;
    }

    String ComplexAdd(ComplexNumbers other) {
        r = Double.toString(real + other.real);
        c = Double.toString(complex + other.complex);
        return (r + " + " + c + "i");
    }
    String ComplexSub(ComplexNumbers other) {
        r = Double.toString(real - other.real);
        c = Double.toString(complex - other.complex);
        return (r + " + " + c + "i");
    }
    String ComplexInv() {
        r = String.format("%(.3f", (real / ComplexNeg()));
        c = String.format("%(.3f", (-complex/ComplexNeg()));
        return (r + " - " + c + "i");
    }
    double ComplexNeg() {
        return Math.pow(real, 2) + Math.pow(complex, 2);
    }
    String ComplexMult(ComplexNumbers other) {
        r = Double.toString(real * other.real - complex * other.complex);
        c = Double.toString(complex * other.real + real * other.complex);
        return (r + " + " + c + "i");
    }
    String ComplexDiv(ComplexNumbers other) {
        r = String.format("%(.3f",(real * other.real + complex * other.complex)/other.ComplexNeg());
        c = String.format("%(.3f",(complex * other.real - real * other.complex)/other.ComplexNeg());
        return (r + " - " + c + "i");
    }
}
