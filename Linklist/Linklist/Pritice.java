package Linklist;

public class Pritice {

      public static class Node {
            int data;
            Node next;

            Node(int data) {
                  this.data = data;
            }
      }

      // 1😁
      public static void display(Node head) {
            while (head != null) {
                  System.out.print(head.data + " ");
                  head = head.next;
            }
            System.out.println(); // Add a newline after printing
      }

      // 2😁😁
      public static void displayRec(Node head) {
            if (head == null)
                  return;
            System.out.print(head.data + " ");
            displayRec(head.next);
      }

      // 3😁😁😁
      public static void displayReverse(Node head) {
            if (head == null)
                  return;
            displayReverse(head.next);
            System.out.print(head.data + " ");
      }

      // 4😁😁😁😁
      public static int length(Node head) {
            int count = 0;
            while (head != null) {
                  count++;
                  head = head.next;
            }
            return count;
      }

      // 5😁😁😁😁😁
      public static class Linklist {
            Node head = null;
            Node tail = null;

            void insertEnd(int val) {
                  Node temp = new Node(val);
                  if (head == null) {
                        head = temp;
                        tail = temp;
                  } else {
                        tail.next = temp;
                        tail = temp;
                  }
            }

            void display() {
                  Pritice.display(head);
            }

            void insertAtHead(int val) {
                  Node temp = new Node(val);
                  if (head == null) {
                        insertEnd(val);
                  } else {
                        temp.next = head;
                        head = temp;
                  }
            }

            void insertAtIndx(int idx, int val) {
                  if (idx == 0) {
                        insertAtHead(val);
                        return;
                  }
                  Node t = new Node(val);
                  Node temp = head;
                  for (int i = 1; i <= idx - 1 && temp != null; i++) {
                        temp = temp.next;
                  }
                  if (temp == null) {
                        System.out.println("Index out of bounds");
                        return;
                  }
                  t.next = temp.next;
                  temp.next = t;
            }

            void removeTail() {
                  if (head == null || head.next == null) {
                        head = null;
                        tail = null;
                        return;
                  }
                  Node temp = head;
                  while (temp.next != null && temp.next.next != null) {
                        temp = temp.next;
                  }
                  temp.next = null;
                  tail = temp;
            }

            void removeHead() {
                  if (head == null) {
                        return;
                  }
                  if (head.next == null) {
                        head = null;
                        tail = null;
                  } else {
                        head = head.next;
                  }
            }

            Node removetail() {
                  if (head == null || head.next == null) {
                        return head;
                  }
                  Node current = head;
                  Node prev = null;

                  while (current.next != null) {
                        prev = current;
                        current = current.next;
                  }
                  prev.next = null;
                  return head;
            }
      }

      public static void main(String[] args) {
            Linklist ll = new Linklist();
            ll.insertEnd(4);
            ll.insertEnd(5);
            ll.display();
            System.out.println();
            ll.insertAtHead(6);
            ll.display();
            ll.insertAtIndx(2, 10);
            ll.display();
            ll.removeTail();
            ll.display();
            ll.removeHead();
            ll.display();
            System.out.println();
            ll.removeTail();

            ll.display();
      }
}
