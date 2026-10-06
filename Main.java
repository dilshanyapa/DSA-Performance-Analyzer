import java.util.Scanner;

/**
 * ============================================================================
 * CIT300 - Data Structures and Algorithms
 * Graded Practical Assignment 2: Data Structure and Graph Performance Analyzer[cite: 2]
 * ============================================================================
 * 
 * Team Responsibilities:
 * - Lead / Member 1: Main Integration, Array Operations, Searching, Performance Comparison[cite: 5, 6]
 * - Member 2: Stack & Queue Operations[cite: 5]
 * - Member 3: Linked List Operations[cite: 5]
 * - Member 4: Graph Operations & Traversals (BFS, DFS)[cite: 6]
 */
public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    // ============================================================================
    // COMPONENT INSTANCES
    // ============================================================================
    // Member 1 Components (Array is ready and active)[cite: 2, 5]
    private static final CustomArray arrayComponent = new CustomArray(20);

    // STATUS FLAGS: Change to 'true' once respective members finish their logic
    private static final boolean IS_STACK_READY = false;       // Set to true by Member 2
    private static final boolean IS_QUEUE_READY = false;       // Set to true by Member 2
    private static final boolean IS_LINKED_LIST_READY = true; // Set to true by Member 3
    private static final boolean IS_GRAPH_READY = true;       // Set to true by Member 4

    // Teammate classes: Uncomment when members push their class files
    // private static CustomStack stackComponent = new CustomStack(10);
    // private static CustomQueue queueComponent = new CustomQueue(10);
    private static CustomLinkedList linkedListComponent = new CustomLinkedList();
    private static Graph graphComponent = new Graph();

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            printMainMenu();
            int choice = readIntegerInput("Enter your choice: ");

            switch (choice) {
                case 1:
                    handleArrayMenu();
                    break;
                case 2:
                    handleStackMenu();
                    break;
                case 3:
                    handleQueueMenu();
                    break;
                case 4:
                    handleLinkedListMenu();
                    break;
                case 5:
                    handleSearchingMenu();
                    break;
                case 6:
                    handleGraphMenu();
                    break;
                case 7:
                    handlePerformanceComparison();
                    break;
                case 8:
                    handleDisplayAll();
                    break;
                case 9:
                    System.out.println("\n[Info] Exiting application. Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("[Error] Invalid selection. Choose a number between 1 and 9.");
            }
        }
    }

    // ============================================================================
    // MAIN MENU DISPLAY
    // ============================================================================
    private static void printMainMenu() {
        System.out.println("\n==========================================");
        System.out.println("   DATA STRUCTURE & GRAPH ANALYZER");
        System.out.println("==========================================");
        System.out.println("1. Array Operations");
        System.out.println("2. Stack Operations");
        System.out.println("3. Queue Operations");
        System.out.println("4. Linked List Operations");
        System.out.println("5. Searching Operations");
        System.out.println("6. Graph Operations");
        System.out.println("7. Performance Comparison");
        System.out.println("8. Display All Results");
        System.out.println("9. Exit");
        System.out.println("==========================================");
    }

    // ============================================================================
    // 1. ARRAY OPERATIONS MENU (MEMBER 1)
    // ============================================================================
    private static void handleArrayMenu() {
        boolean inArrayMenu = true;

        while (inArrayMenu) {
            System.out.println("\n--- ARRAY OPERATIONS (Member 1) ---");
            System.out.println("1. Insert Element");
            System.out.println("2. Delete Element");
            System.out.println("3. Search Element");
            System.out.println("4. Display Array");
            System.out.println("5. Return to Main Menu");

            int choice = readIntegerInput("Choose an operation (1-5): ");

            switch (choice) {
                case 1:
                    int valToInsert = readIntegerInput("Enter integer to insert: ");
                    arrayComponent.insert(valToInsert);
                    break;
                case 2:
                    int valToDelete = readIntegerInput("Enter integer to delete: ");
                    arrayComponent.delete(valToDelete);
                    break;
                case 3:
                    int valToSearch = readIntegerInput("Enter integer to search: ");
                    int foundIndex = arrayComponent.search(valToSearch);
                    if (foundIndex != -1) {
                        System.out.println("[Result] Element " + valToSearch + " found at index " + foundIndex);
                    } else {
                        System.out.println("[Result] Element " + valToSearch + " not found in array.");
                    }
                    break;
                case 4:
                    arrayComponent.display();
                    break;
                case 5:
                    inArrayMenu = false;
                    break;
                default:
                    System.out.println("[Error] Invalid option. Choose between 1 and 5.");
            }
        }
    }

    // ============================================================================
    // 2. STACK OPERATIONS MENU (MEMBER 2)
    // ============================================================================
    private static void handleStackMenu() {
        if (!IS_STACK_READY) {
            System.out.println("\n[Notice] Stack module is currently under development by Member 2.");
            System.out.println("Once implemented, change 'IS_STACK_READY = true' to enable this menu.");
            return;
        }

        boolean inStackMenu = true;
        while (inStackMenu) {
            System.out.println("\n--- STACK OPERATIONS (Member 2) ---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display Stack");
            System.out.println("5. Return to Main Menu");

            int choice = readIntegerInput("Choose an operation (1-5): ");

            switch (choice) {
                case 1:
                    // TODO: MEMBER 2 - Write Push logic here[cite: 3]
                    break;
                case 2:
                    // TODO: MEMBER 2 - Write Pop logic here[cite: 3]
                    break;
                case 3:
                    // TODO: MEMBER 2 - Write Peek logic here[cite: 3]
                    break;
                case 4:
                    // TODO: MEMBER 2 - Write Display logic here[cite: 3]
                    break;
                case 5:
                    inStackMenu = false;
                    break;
                default:
                    System.out.println("[Error] Invalid option. Choose between 1 and 5.");
            }
        }
    }

    // ============================================================================
    // 3. QUEUE OPERATIONS MENU (MEMBER 2)
    // ============================================================================
    private static void handleQueueMenu() {
        if (!IS_QUEUE_READY) {
            System.out.println("\n[Notice] Queue module is currently under development by Member 2.");
            System.out.println("Once implemented, change 'IS_QUEUE_READY = true' to enable this menu.");
            return;
        }

        boolean inQueueMenu = true;
        while (inQueueMenu) {
            System.out.println("\n--- QUEUE OPERATIONS (Member 2) ---");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek / Front");
            System.out.println("4. Display Queue");
            System.out.println("5. Return to Main Menu");

            int choice = readIntegerInput("Choose an operation (1-5): ");

            switch (choice) {
                case 1:
                    // TODO: MEMBER 2 - Write Enqueue logic here[cite: 3]
                    break;
                case 2:
                    // TODO: MEMBER 2 - Write Dequeue logic here[cite: 3]
                    break;
                case 3:
                    // TODO: MEMBER 2 - Write Peek logic here[cite: 3]
                    break;
                case 4:
                    // TODO: MEMBER 2 - Write Display logic here[cite: 3]
                    break;
                case 5:
                    inQueueMenu = false;
                    break;
                default:
                    System.out.println("[Error] Invalid option. Choose between 1 and 5.");
            }
        }
    }

    // ============================================================================
    // 4. LINKED LIST OPERATIONS MENU (MEMBER 3)
    // ============================================================================
    private static void handleLinkedListMenu() {
        if (!IS_LINKED_LIST_READY) {
            System.out.println("\n[Notice] Linked List module is currently under development by Member 3.");
            System.out.println("Once implemented, change 'IS_LINKED_LIST_READY = true' to enable this menu.");
            return;
        }

        boolean inListMenu = true;
        while (inListMenu) {
            System.out.println("\n--- LINKED LIST OPERATIONS (Member 3) ---");
            System.out.println("1. Insert Element");
            System.out.println("2. Delete Element");
            System.out.println("3. Search Element");
            System.out.println("4. Display Linked List");
            System.out.println("5. Return to Main Menu");

            int choice = readIntegerInput("Choose an operation (1-5): ");

            switch (choice) {
                case 1:
                    int valToInsert = readIntegerInput("Enter integer to insert: ");
                    linkedListComponent.insert(valToInsert);
                    break;
                case 2:
                    int valToDelete = readIntegerInput("Enter integer to delete: ");
                    linkedListComponent.delete(valToDelete);                    
                    break;
                case 3:
                    int valToSearch = readIntegerInput("Enter integer to search: ");
                    int foundIndex = linkedListComponent.search(valToSearch);
                    if (foundIndex != -1) {
                        System.out.println("[Result] Element " + valToSearch + " found at position " + foundIndex);
                    } else {
                        System.out.println("[Result] Element " + valToSearch + " not found in list.");
                    }
                    break;
                case 4:
                    linkedListComponent.display();
                    break;
                case 5:
                    inListMenu = false;
                    break;
                default:
                    System.out.println("[Error] Invalid option. Choose between 1 and 5.");
            }
        }
    }

    // ============================================================================
    // 5. SEARCHING OPERATIONS MENU (MEMBER 1)
    // ============================================================================
    private static void handleSearchingMenu() {
        int[] data = arrayComponent.getRawData();
        if (data.length == 0) {
            System.out.println("\n[Warning] Array is currently empty. Insert items via Option 1 first.");
            return;
        }

        System.out.println("\n--- SEARCHING OPERATIONS (Member 1) ---");
        int target = readIntegerInput("Enter element to search for: ");

        // Linear Search Execution
        SearchAnalyzer.SearchResult linearRes = SearchAnalyzer.linearSearch(data, target);
        System.out.println("\n[Linear Search Result]");
        if (linearRes.index != -1) {
            System.out.println("Status: Found at index " + linearRes.index);
        } else {
            System.out.println("Status: Not Found");
        }
        System.out.println("Steps Taken: " + linearRes.steps);

        // Binary Search Execution
        SearchAnalyzer.SearchResult binaryRes = SearchAnalyzer.binarySearch(data, target);
        System.out.println("\n[Binary Search Result (Applied on Sorted Data)]");
        if (binaryRes.index != -1) {
            System.out.println("Status: Found at sorted index " + binaryRes.index);
        } else {
            System.out.println("Status: Not Found");
        }
        System.out.println("Steps Taken: " + binaryRes.steps);
    }

    // ============================================================================
    // 6. GRAPH OPERATIONS MENU (MEMBER 4)
    // ============================================================================
    private static void handleGraphMenu() {
        if (!IS_GRAPH_READY) {
            System.out.println("\n[Notice] Graph module is currently under development by Member 4.");
            System.out.println("Once implemented, change 'IS_GRAPH_READY = true' to enable this menu.");
            return;
        }

        boolean inGraphMenu = true;
        while (inGraphMenu) {
            System.out.println("\n--- GRAPH OPERATIONS (Member 4) ---");
            System.out.println("1. Add Vertex");
            System.out.println("2. Add Edge");
            System.out.println("3. Display Graph");
            System.out.println("4. BFS Traversal");
            System.out.println("5. DFS Traversal");
            System.out.println("6. Return to Main Menu");

            int choice = readIntegerInput("Choose an operation (1-6): ");

            switch (choice) {
                case 1:
                    // MEMBER 4 - Add Vertex logic here
                    System.out.print("Enter vertex name: ");
                    String vertexName = scanner.nextLine().trim();
                    graphComponent.addVertex(vertexName);
                    break;
                case 2:
                    // MEMBER 4 - Add Edge logic here[cite: 3]
                    System.out.print("Enter first vertex: ");
                    String edgeA = scanner.nextLine().trim();
                    System.out.print("Enter second vertex: ");
                    String edgeB = scanner.nextLine().trim();
                    graphComponent.addEdge(edgeA, edgeB);
                    break;
                case 3:
                    // MEMBER 4 - Display Graph logic here[cite: 3]
                    graphComponent.displayGraph();
                    break;
                case 4:
                    // MEMBER 4 - BFS Traversal logic here[cite: 3]
                    System.out.print("Enter starting vertex for BFS: ");
                    String bfsStart = scanner.nextLine().trim();
                    graphComponent.traverseBFS(bfsStart);
                    break;
                case 5:
                    // MEMBER 4 - DFS Traversal logic here[cite: 3]
                    System.out.print("Enter starting vertex for DFS: ");
                    String dfsStart = scanner.nextLine().trim();
                    graphComponent.traverseDFS(dfsStart);
                    break;
                case 6:
                    inGraphMenu = false;
                    break;
                default:
                    System.out.println("[Error] Invalid option. Choose between 1 and 6.");
            }
        }
    }

    // ============================================================================
    // 7. PERFORMANCE COMPARISON (LEAD / INTEGRATION)
    // ============================================================================
    private static void handlePerformanceComparison() {
        System.out.println("\n--- PERFORMANCE COMPARISON ---");
        int[] data = arrayComponent.getRawData();

        if (data.length == 0) {
            System.out.println("[Warning] Please insert values into the Array (Option 1) before benchmarking.");
        } else {
            int target = readIntegerInput("Enter target value to benchmark Linear vs Binary Search: ");
            PerformanceAnalyzer.printSearchComparison(data, target);
        }

        if (!IS_GRAPH_READY) {
            System.out.println("[Notice] Graph Traversal benchmark will activate once Member 4 completes the Graph module.");
        } else {
            // TODO: MEMBER 4 & LEAD - Call PerformanceAnalyzer.printTraversalComparison(...) here
        }
    }

    // ============================================================================
    // 8. DISPLAY ALL RESULTS (LEAD / INTEGRATION)
    // ============================================================================
    private static void handleDisplayAll() {
        System.out.println("\n==========================================");
        System.out.println("   CURRENT STATE OF ALL DATA STRUCTURES");
        System.out.println("==========================================");

        System.out.println("\n[1] Array Component:");
        arrayComponent.display();

        System.out.println("\n[2] Stack Component (Member 2):");
        if (IS_STACK_READY) {
            // stackComponent.display();
        } else {
            System.out.println("Pending Member 2 implementation.");
        }

        System.out.println("\n[3] Queue Component (Member 2):");
        if (IS_QUEUE_READY) {
            // queueComponent.display();
        } else {
            System.out.println("Pending Member 2 implementation.");
        }

        System.out.println("\n[4] Linked List Component (Member 3):");
        if (IS_LINKED_LIST_READY) {
            linkedListComponent.display();
        } else {
            System.out.println("Pending Member 3 implementation.");
        }


        System.out.println("\n[5] Graph Component (Member 4):");
        if (IS_GRAPH_READY) {
            // graphComponent.displayGraph();
        } else {
            System.out.println("Pending Member 4 implementation.");
        }
        System.out.println("==========================================");
    }

    // ============================================================================
    // UTILITY: INTEGER INPUT VALIDATION
    // ============================================================================
    public static int readIntegerInput(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("[Input Error] Invalid input. Please enter a valid number.");
            }
        }
    }
}