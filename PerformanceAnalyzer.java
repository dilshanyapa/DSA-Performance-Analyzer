// Class to display the performance comparison table
public class PerformanceAnalyzer {

    // Display comparison table for Searching algorithms
    public static void printSearchComparison(int[] data, int target) {
        if (data.length == 0) {
            System.out.println("Array is empty! Add data first.");
            return;
        }

        // Run both search algorithms
        SearchAnalyzer.SearchResult linearResult = SearchAnalyzer.linearSearch(data, target);
        SearchAnalyzer.SearchResult binaryResult = SearchAnalyzer.binarySearch(data, target);

        // Print table formatted exactly as requested in assignment
        System.out.println("\n-------------------------------------------");
        System.out.println("          PERFORMANCE COMPARISON           ");
        System.out.println("-------------------------------------------");
        System.out.printf("%-15s | %-15s | %-5s\n", "Operation", "Algorithm", "Steps");
        System.out.println("-------------------------------------------");
        System.out.printf("%-15s | %-15s | %-5d\n", "Search", "Linear Search", linearResult.steps);
        System.out.printf("%-15s | %-15s | %-5d\n", "Search", "Binary Search", binaryResult.steps);
        System.out.println("-------------------------------------------\n");
    }

    // Display comparison table for Graph Traversals (to be connected with Member 4)
    public static void printTraversalComparison(int bfsSteps, int dfsSteps) {
        System.out.println("\n-------------------------------------------");
        System.out.println("          PERFORMANCE COMPARISON           ");
        System.out.println("-------------------------------------------");
        System.out.printf("%-15s | %-15s | %-5s\n", "Operation", "Algorithm", "Steps");
        System.out.println("-------------------------------------------");
        System.out.printf("%-15s | %-15s | %-5d\n", "Graph Traversal", "BFS", bfsSteps);
        System.out.printf("%-15s | %-15s | %-5d\n", "Graph Traversal", "DFS", dfsSteps);
        System.out.println("-------------------------------------------\n");
    }
}