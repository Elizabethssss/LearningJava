import java.util.Scanner;

class Process {
    private Scanner in = new Scanner(System.in);
    private String input;
    private String vowels = "aeiou";
    private String result;
    private String[] words;
    private char[] charBox;

    void process() {
        System.out.println("Pig Latin");
        System.out.print("Enter a string: ");
        if ((input = in.nextLine()) != null) {
            words = input.split(" ");
            for (String str : words) {
                result = str;
                charBox = str.toCharArray();
                for (char c : charBox) {
                    if (vowels.indexOf(c) == -1) {
                        result += c;
                        result = result.substring(1);
                    } else break;
                }
                System.out.print(result + "ay ");
            }
        }
        System.out.println();
    }
}