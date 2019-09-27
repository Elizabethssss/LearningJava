import java.util.Scanner;

class Process {
    private Scanner in = new Scanner(System.in);
    private String first, second;
    private String[] coordinate;
    private double x1, x2, y1, y2;

    void process() {
        System.out.println("Distance Between Two Cities");
        System.out.print("Enter the first coordinate: ");
        first = in.nextLine();
        coordinate = first.split(", ");
        x1 = Double.parseDouble(coordinate[0]);
        y1 = Double.parseDouble(coordinate[1]);
        System.out.print("Enter the first coordinate: ");
        second = in.nextLine();
        coordinate = second.split(", ");
        x2 = Double.parseDouble(coordinate[0]);
        y2 = Double.parseDouble(coordinate[1]);

        System.out.println("Distance between two cities is " +
                String.format( "%(.2f", Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2))));
    }
}
