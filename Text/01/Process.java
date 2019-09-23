import java.util.Scanner;

class Process {
    private Scanner in = new Scanner(System.in);
    private String input;
    private String vowels = "aeiou";
    private String result;
    private char[] charBox;

    void process() {
        System.out.println("Pig Latin");
        System.out.print("What word would you like to translate to Pig Latin?: ");
        while ((input = in.next()) != null) {
            result = input;
            charBox = input.toCharArray();
            for (char c : charBox) {
                if (vowels.indexOf(c) == -1) {
                    result += c;
                    result = result.substring(1);
                } else break;
            }
            System.out.print(result + "ay ");
        }
    }
}
