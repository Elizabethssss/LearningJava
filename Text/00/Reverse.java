import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
     //   Process pr = new Process();
     //   pr.process();
        Scanner scanner = new Scanner(System.in);
        String word;
        System.out.println("Reversing a String");
        System.out.print("Enter a string: ");
        word = scanner.nextLine();
        String reverse = "";
        for(int i = word.length() - 1; i >= 0; i--)
            reverse += word.charAt(i);
        System.out.println(reverse);
    }
}
