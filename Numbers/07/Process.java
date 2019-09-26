import java.util.Scanner;

class Process {
    private Scanner in = new Scanner(System.in);
    private int decimal, resultInt = 0;
    private String binary = "", resultBin = "";

    void process() {
        System.out.println("Binary to Decimal and Back Converter");
        System.out.print("Enter decimal number: ");
        decimal = in.nextInt();
        while (decimal >= 1){
                binary += decimal % 2;
            decimal /= 2;
        }
        for(int i = binary.length() - 1; i >= 0; i--)
            resultBin += binary.charAt(i);
        System.out.println(resultBin);
        resultBin = "";
        binary = "";
        System.out.print("Enter binary number: ");
        in.nextLine();
        resultBin = in.nextLine();
        for(int i = resultBin.length() - 1; i >= 0; i--)
            binary += resultBin.charAt(i);
        for (int i = 0; i < binary.length(); i++) {
            if(binary.charAt(i) == '1')
                resultInt += Math.pow(2, i);
        }
        System.out.println(resultInt);
    }
}
