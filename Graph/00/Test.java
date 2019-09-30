import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input;
        String[] vertex;
        Graph graph = new Graph();

        System.out.println("Enter vertices: ");
        input = in.nextLine();
        vertex = input.split(",");
        for(String v : vertex)
            graph.addVertex(v);
        System.out.println("Enter links (x to finish): ");
        while (!(input = in.next()).equals("x")) {
            graph.addEdge(input.split("")[0], input.split("")[1]);
        }
        for(String v : vertex) {
            System.out.println(v + ": " + graph.getAdjVertices(v));
        }
    }
}
