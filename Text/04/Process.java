import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

class Process {
    private Scanner in = new Scanner(System.in);
    private String input;
    private int count = 0;

    void process() throws IOException {
        System.out.println("Count Words in a String");
        System.out.print("Enter string: ");
        input = in.nextLine();
        count = input.split(" ").length;
        System.out.println("Number of words from entered string: " + count);
        count = 0;

        BufferedReader br = new BufferedReader(new FileReader("aaa.txt"));
        while((input = br.readLine()) != null)
            count += input.split(" ").length;
        System.out.println("Number of words from file: " + count);

    }
}
