package Linklist;

public class basic {

      public static void display(Node head) {
            // Print the linked list using a while loop
            Node temp = head;
            while (temp != null) {
                  System.out.print(temp.data + " ");
                  temp = temp.next;
            }

      }

      public static int length(Node head) {
            int count = 0;
            while (head != null) {
                  count++;
                  head = head.next;
            }
            return count;
      }

      public static class Node {
            int data;
            Node next;

            Node(int data) {
                  this.data = data;
                  this.next = null;
            }
      }

      public static void main(String[] args) {
            Node x = new Node(5);
            Node y = new Node(7);
            Node z = new Node(4);
            Node m = new Node(1);
            Node n = new Node(3);
            Node e = new Node(2);

            // Linking nodes
            x.next = y;
            y.next = z;
            z.next = m;
            m.next = n;
            n.next = e;

            System.out.println(length(x));
      }
}
