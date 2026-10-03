// Custom class to handle basic Array operations[cite: 2]
public class CustomArray {
    private int[] arr;
    private int size;
    private int capacity;

    // Constructor to set array capacity
    public CustomArray(int capacity) {
        this.capacity = capacity;
        this.arr = new int[capacity];
        this.size = 0;
    }

    // 1. Insert element to the array
    public boolean insert(int value) {
        // Check if array is full
        if (size >= capacity) {
            System.out.println("Array is full! Cannot insert " + value);
            return false;
        }
        arr[size] = value;
        size++;
        System.out.println("Inserted: " + value);
        return true;
    }

    // 2. Delete element by valu
    public boolean delete(int value) {
        int index = search(value);
        // If element is not found
        if (index == -1) {
            System.out.println("Element " + value + " not found!");
            return false;
        }

        // Shift elements to the left to delete
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
        System.out.println("Deleted: " + value);
        return true;
    }

    // 3. Search for element and return its index
    public int search(int value) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == value) {
                return i; 
            }
        }
        return -1;
    }

    // 4. Display all array elements[cite: 2]
    public void display() {
        if (size == 0) {
            System.out.println("Array is empty.");
            return;
        }
        System.out.print("Array elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Returns a copy of the actual elements
    public int[] getRawData() {
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = arr[i];
        }
        return result;
    }

    public int getSize() {
        return size;
    }
}
