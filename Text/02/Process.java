import java.util.Scanner;

class Process {
    private Scanner in = new Scanner(System.in);
    private String input;
    private String[] words;
    private char[] charBox;
    private char[] vowels = {'a', 'e', 'i', 'o', 'u'};
    private int[] count = new int[5];
    private int sum = 0;

    void process() {
        System.out.println("Count Vowels");
        System.out.print("Enter a string: ");
        if ((input = in.nextLine()) != null) {
            words = input.split(" ");
            for(String str : words) {
                charBox = str.toCharArray();
                for (char c : charBox) {
                    for (int i = 0; i < vowels.length; i++) {
                        if (c == vowels[i]) {
                            sum++;
                            count[i]++;
                        }
                    }
                }
            }
        }
        System.out.println("Number of vowels is " + sum);
        System.out.println("Number of As " + count[0]);
        System.out.println("Number of Es " + count[1]);
        System.out.println("Number of Is " + count[2]);
        System.out.println("Number of Os " + count[3]);
        System.out.println("Number of Us " + count[4]);
    }
}