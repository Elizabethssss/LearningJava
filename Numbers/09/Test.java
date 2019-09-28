import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Tax Calculator");
        System.out.print("Enter category (length, area, volume, mass, temperature, data): ");
        String category = in.nextLine();
        new Converter(category);
    }
}
