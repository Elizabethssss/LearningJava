import java.util.Scanner;

class Process {
    private Scanner in = new Scanner(System.in);
    private String stringNumber;
    private String[] stringNumberArr;

    void process() {
        System.out.println("Credit Card Validator");
        System.out.print("Enter the credit card number: ");
        stringNumber = in.nextLine();
        stringNumberArr = stringNumber.replaceAll(" ", "").split("");
        int[] number = new int[stringNumberArr.length];
        for (int i = 0; i < stringNumberArr.length; i++)
            number[i] = Integer.parseInt(stringNumberArr[i]);
        checkLuhn(number);
    }
    private void checkLuhn(int[] number) {
        int sum = 0;
        int N = number.length;
        for(int i = 1; i <= N; i++) {
            int num = number[N - i];
            if(i % 2 == 0) {
                num = num*2;
                if(num > 9)
                    num -= 9;
            }
            sum += num;
        }
        System.out.println(sum);
        if(sum % 10 == 0)
            System.out.println("Number is valid");
        else {
            System.out.println("Number is invalid!");
        }
    }
}
