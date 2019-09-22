import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

class Pi {
	public static void main( String[] args ) {
		Scanner in = new Scanner(System.in);
		BigDecimal bd1, bd2;
		int n;
		double num;
		System.out.println("Find n Pi number");
		System.out.print("Enter n: ");
		n = in.nextInt();
		if(n > 50)
			n = 50;
		num = (16*Math.atan(1./5) - 4*Math.atan(1./239));
		bd1 = new BigDecimal(num);
		bd2 = bd1.setScale(n, RoundingMode.FLOOR);
		System.out.println(bd2);
		in.close();
	}
}
