import java.util.*;

class Graph {
    private Map<String, List<String>> adjVertices = new HashMap<>();

    void addVertex(String label) {
        adjVertices.putIfAbsent(label, new ArrayList<>());
    }

    void addEdge(String l1, String l2) {
        adjVertices.get(l1).add(l2);
        adjVertices.get(l2).add(l1);
    }

    List<String> getAdjVertices(String label) {
        return adjVertices.get(label);
    }

}
