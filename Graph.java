import java.util.*;

public class Graph {

    private Map<String, List<String>> adjacencyList;

    public Graph() {
        adjacencyList = new LinkedHashMap<>();
    }

    // 1. Add Vertex
    public boolean addVertex(String vertex) {
        if (vertex == null || vertex.trim().isEmpty()) {
            System.out.println("[Error] Vertex name cannot be empty.");
            return false;
        }
        vertex = vertex.trim();
        if (adjacencyList.containsKey(vertex)) {
            System.out.println("[Error] Vertex '" + vertex + "' already exists.");
            return false;
        }
        adjacencyList.put(vertex, new ArrayList<>());
        System.out.println("[Success] Vertex '" + vertex + "' added.");
        return true;
    }

    // 2. Add Edge (undirected: added in both directions)
    public boolean addEdge(String vertexA, String vertexB) {
        if (!adjacencyList.containsKey(vertexA) || !adjacencyList.containsKey(vertexB)) {
            System.out.println("[Error] Both vertices must exist before adding an edge.");
            return false;
        }
        if (vertexA.equals(vertexB)) {
            System.out.println("[Error] Cannot connect a vertex to itself.");
            return false;
        }
        if (adjacencyList.get(vertexA).contains(vertexB)) {
            System.out.println("[Error] An edge between '" + vertexA + "' and '" + vertexB + "' already exists.");
            return false;
        }
        adjacencyList.get(vertexA).add(vertexB);
        adjacencyList.get(vertexB).add(vertexA);
        System.out.println("[Success] Edge added between '" + vertexA + "' and '" + vertexB + "'.");
        return true;
    }

    // 3. Display Graph
    public void displayGraph() {
        if (adjacencyList.isEmpty()) {
            System.out.println("[Notice] No vertices have been added yet.");
            return;
        }
        System.out.println("\n--- Graph Structure (Adjacency List) ---");
        for (Map.Entry<String, List<String>> entry : adjacencyList.entrySet()) {
            String neighbours = entry.getValue().isEmpty()
                    ? "(no edges)"
                    : String.join(", ", entry.getValue());
            System.out.println(entry.getKey() + " -> " + neighbours);
        }
    }

    // 4. BFS Traversal
    public int traverseBFS(String start) {
        if (start == null || !adjacencyList.containsKey(start)) {
            System.out.println("[Error] Starting vertex '" + start + "' does not exist.");
            return 0;
        }
        Set<String> visited = new LinkedHashSet<>();
        Queue<String> queue = new LinkedList<>();
        queue.add(start);
        visited.add(start);
        int steps = 0;

        System.out.print("\n--- BFS Traversal from '" + start + "' ---\n");
        boolean first = true;
        while (!queue.isEmpty()) {
            String current = queue.poll();
            steps++;
            System.out.print((first ? "" : " -> ") + current);
            first = false;
            for (String neighbour : adjacencyList.get(current)) {
                if (!visited.contains(neighbour)) {
                    visited.add(neighbour);
                    queue.add(neighbour);
                }
            }
        }
        System.out.println();
        reportUnreached(visited);
        return steps;
    }

    // 5. DFS Traversal
    public int traverseDFS(String start) {
        if (start == null || !adjacencyList.containsKey(start)) {
            System.out.println("[Error] Starting vertex '" + start + "' does not exist.");
            return 0;
        }
        Set<String> visited = new LinkedHashSet<>();
        Deque<String> stack = new ArrayDeque<>();
        stack.push(start);
        int steps = 0;

        System.out.print("\n--- DFS Traversal from '" + start + "' ---\n");
        boolean first = true;
        while (!stack.isEmpty()) {
            String current = stack.pop();
            steps++;
            if (visited.contains(current)) {
                continue;
            }
            visited.add(current);
            System.out.print((first ? "" : " -> ") + current);
            first = false;

            List<String> neighbours = adjacencyList.get(current);
            for (int i = neighbours.size() - 1; i >= 0; i--) {
                if (!visited.contains(neighbours.get(i))) {
                    stack.push(neighbours.get(i));
                }
            }
        }
        System.out.println();
        reportUnreached(visited);
        return steps;
    }

    private void reportUnreached(Set<String> visited) {
        int unreached = adjacencyList.size() - visited.size();
        if (unreached > 0) {
            System.out.println("[Notice] " + unreached + " vertex/vertices were not reachable from the start point.");
        }
    }

    
    public boolean hasVertex(String name) {
        return adjacencyList.containsKey(name);
    }
}