public class CustomLinkedList {

    private Node head;
    private int size;

    // 1. Insert a value to the list
    public boolean insert(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
        System.out.println("Inserted: " + value);
        return true;
    }

    // 2. Delete the first node matching the given value
    public boolean delete(int value) {
        if (head == null) {
            System.out.println("Linked list is empty! Cannot delete " + value);
            return false;
        }

        if (head.value == value) {
            head = head.next;
            size--;
            System.out.println("Deleted: " + value);
            return true;
        }

        Node current = head;
        while (current.next != null && current.next.value != value) {
            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Element " + value + " not found!");
            return false;
        }

        current.next = current.next.next;
        size--;
        System.out.println("Deleted: " + value);
        return true;
    }

    // 3. Search for a value in the list 
    public int search(int value) {
        Node current = head;
        int position = 0;
        while (current != null) {
            if (current.value == value) {
                return position;
            }
            current = current.next;
            position++;
        }
        return -1;
    }

    // 4. Display elements in the list
    public void display() {
        if (head == null) {
            System.out.println("Linked list is empty.");
            return;
        }
        System.out.print("Linked list elements: ");
        Node current = head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }

    public int getSize() {
        return size;
    }
}