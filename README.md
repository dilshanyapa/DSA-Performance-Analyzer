# ⚡ Data Structure & Graph Performance Analyzer
> **CIT300: Data Structures & Algorithms — Graded Practical Assignment 2**  
> *Sri Lanka Technological Campus (SLTC) | Faculty of Computing & IT*

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Git](https://img.shields.io/badge/GIT-E44C30?style=for-the-badge&logo=git&logoColor=white)
![Team](https://img.shields.io/badge/Team-Group%2049-blue?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Completed-success?style=for-the-badge)

---

## 📌 Project Overview
This repository contains a unified, console-based Java application designed to implement, demonstrate, and evaluate fundamental data structures and algorithmic efficiency. The system integrates linear data structures, pointer-based linked memory models, searching algorithms, and graph traversals (BFS & DFS) with real-time operational step counting and execution performance benchmarking.

---

## 👥 Engineering Team — Group 49

| Student ID | Full Name | Assigned Responsibility | Individual Contribution |
| :--- | :--- | :--- | :--- |
| **23DA2-0236** | **Y. M. C. D. Yapa** | **Team Lead & Member 1**<br>• Array Operations<br>• Search Engine<br>• Performance Benchmark<br>• Master Integration | • Designed and developed `CustomArray` (insert, delete, search, display with overflow/underflow handling).<br>• Implemented `SearchAnalyzer` (Linear Search & Binary Search with comparison/step tracking).<br>• Developed `PerformanceAnalyzer` to benchmark operations and print formatted complexity comparison tables.<br>• Built the master console menu architecture (`Main.java`) with robust input validation.<br>• Managed Git branching workflows, branch merging, pull requests, and README documentation. |
| **23DA2-0238** | **W. H. M. Chanuki** | **Member 2**<br>• Stack Operations<br>• Queue Operations | • Implemented `CustomStack` with LIFO semantics (`push`, `pop`, `peek`, `display`).<br>• Implemented `CustomQueue` with FIFO semantics (`enqueue`, `dequeue`, `peek`, `display`).<br>• Engineered defensive boundaries for empty collection underflow and capacity overflow conditions.<br>• Integrated Stack and Queue interactive console submenus into the main application. |
| **23DA2-0041** | **P. K. Sadhanee Devindi** | **Member 3**<br>• Linked List Component | • Designed the self-referential `Node` memory structure.<br>• Developed `CustomLinkedList` supporting arbitrary insertion, deletion, lookup, and sequential traversal.<br>• Handled empty list conditions and memory reference reconnection.<br>• Linked the dynamic collection submenu with the centralized CLI driver. |
| **23DA2-0101** | **H. N. M. Dushan** | **Member 4**<br>• Graph Architecture<br>• Graph Traversals | • Constructed the graph topology model in `Graph.java` using vertex and edge mappings.<br>• Implemented Breadth-First Search (BFS) level-order traversal using an auxiliary queue.<br>• Implemented Depth-First Search (DFS) depth-first traversal using recursive/stack tracking.<br>• Integrated graph construction and traversal routines into the main operational loop. |

---

## 🏗️ System Architecture & File Structure

```text
CIT300-DSA-Performance-Analyzer/
├── README.md                      # Comprehensive project documentation
└── src/
    ├── Main.java                  # Master controller, menu router & input validation
    ├── CustomArray.java           # Fixed-size bounded array structure
    ├── SearchAnalyzer.java        # Linear Search & Binary Search step analyzers
    ├── PerformanceAnalyzer.java   # Comparison reporting & formatting engine
    ├── CustomStack.java           # LIFO stack engine with underflow safeguards
    ├── CustomQueue.java           # FIFO queue engine with underflow safeguards
    ├── Node.java                  # Dynamic singly-linked node representation
    ├── CustomLinkedList.java      # Linked chain insertion, search, and deletion
    └── Graph.java                 # Graph topology with BFS & DFS traversal routines
```
## 🎯 Key Features & Modules

1. **Array Operations:** Dynamic insertion, deletion, linear lookup, and boundary validation.
2. **Stack Operations:** LIFO structure with underflow protection during empty pop/peek attempts.
3. **Queue Operations:** FIFO structure with underflow protection during empty dequeue/peek attempts.
4. **Linked List:** Dynamic singly linked list supporting node insertion, deletion, lookup, and traversal.
5. **Searching Algorithms:** Comparative step-tracking for Linear Search **O(n)** vs. Binary Search **O(log n)**.
6. **Graph Traversals:** Graph vertex/edge mapping with Breadth-First Search (BFS) and Depth-First Search (DFS) traversals **O(V + E)**.
7. **Performance Benchmark:** Formatted step-count and execution time analysis comparing algorithms.
8. **State Persistence:** Ability to view all populated data structures simultaneously via Option 8.

---

## 📊 Sample Performance Benchmark Output

```text
=========================== PERFORMANCE COMPARISON ===========================
Operation          | Algorithm        | Steps        | Execution Time    
------------------------------------------------------------------------------
Search (Target: 70)| Linear Search    | 5            | 4200 ns           
Search (Target: 70)| Binary Search    | 2            | 1800 ns           
------------------------------------------------------------------------------
Graph Traversal    | BFS              | 4            | 3100 ns           
Graph Traversal    | DFS              | 4            | 2900 ns           
==============================================================================
```
## 🎥 Demonstration Video

* **Group Identification:** Group 49
* **Total Duration:** Less than 15 minutes
* **Verification Note:** All 4 group members are clearly visible on camera throughout their respective presentations, detailing their assigned codebase, execution, and complexity analysis.
