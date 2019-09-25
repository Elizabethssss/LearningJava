import java.util.Scanner;

class Process {
    private Scanner in = new Scanner(System.in);
    private String input;
    private String result = "";

    void process() {
        System.out.println("Check if Palindrome");
        System.out.print("Enter string: ");
        input = in.nextLine();
        input = input.replaceAll("\\s+", "");
        for(int i = input.length() - 1; i >= 0; i--)
            result += input.charAt(i);
        if(result.equals(input))
            System.out.println("String is a palindrome!");
        else
            System.out.println("String isn't a palindrome.");
    }
}
