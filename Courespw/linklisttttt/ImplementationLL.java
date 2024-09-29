package Courespw.linklisttttt;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

class SLL {
    Node head;
    Node tail;
    int size;

    void insertAtEnd(int val) {
        Node temp = new Node(val);
        if (head == null) {
            head = tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    void insertAtHead(int val) {
        Node temp = new Node(val);
        if (head == null) {
            head = tail = temp;
        } else {
            temp.next = head; // Correct this line
            head = temp;
        }
        size++;
    }

    void insert(int idx, int val) {
        if (idx == 0) {
            insertAtHead(val);
            return;
        }
        if (idx == size) {
            insertAtEnd(val);
            return;
        }
        if (idx > size || idx == 0) {
            System.out.println("Inveled Index");
            return;
        }
        Node temp = new Node(val);
        Node x = head;
        for (int i = 1; i <= idx - 1; i++) {
            x = x.next;
        }

        // insertions part
        temp.next = x.next;
        x.next = temp;
        size++;
    }

    int get(int idx) {
        if (idx < 0 || idx >= size) { // Check for valid index
            System.out.println("Invalid Index");
            return -1;
        }
        Node temp = head;
        for (int i = 0; i < idx; i++) { // Start from head and iterate to idx
            temp = temp.next;
        }
        return temp.val; // Return the value at the given index
    }

 




    void display() { // Correct the spelling here
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
        System.out.println();
    }

    void printSize() { // Renamed to avoid conflict with the `size` variable
        System.out.println("Length of linked list is " + size);
    }
}

public class ImplementationLL { // Corrected class name for conventions

    public static void main(String[] args) {
        SLL list = new SLL();
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.insertAtEnd(50);
        list.insertAtEnd(55);

        list.printSize(); // Use the renamed method
        list.display(); // Use the corrected method name

        list.insertAtHead(88);
        list.insertAtHead(20);
        list.insert(2, 85);

        list.display(); // Display the list again after insertions

        System.out.println(list.get(4));
    }
}
