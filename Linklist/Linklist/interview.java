package Linklist;

public class interview {

      // Finding Nth Node from the end of Linked List

      public static class Node {
            int data;
            Node next;

            Node(int data) {
                  this.data = data;
            }
      }

      public static Node nthNode(Node head, int n) {
            int size = 0;
            Node temp = head;
            while (temp != null) {
                  size++;
                  temp = temp.next;
            }
            if (n > size) {
                  return null; // Handle the case where n is greater than the size of the list
            }
            int a = size - n;
            temp = head;
            // nth node from start
            for (int i = 0; i < a; i++) {
                  temp = temp.next;
            }
            return temp;
      }

      public static void main(String[] args) {
            Node a = new Node(100);
            Node b = new Node(13);
            Node c = new Node(4);
            Node d = new Node(5);
            Node e = new Node(12);
            Node f = new Node(10);

            a.next = b;
            b.next = c;
            c.next = d;
            d.next = e;
            e.next = f;

            Node temp = nthNode(a, 3);

            if (temp != null) {
                  System.out.println("The 3rd node from the end is: " + temp.data);
            } else {
                  System.out.println("The list is shorter than 3 nodes.");
            }
      }
}
