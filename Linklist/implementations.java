package Linklist;

public class implementations {

      public static class Node {
            int data;
            Node Next;

            Node(int data) {
                  this.data = data;
            }

      }
 
      public static class linkedlist {
            Node head = null;
            Node tail = null;
            int size = 0;

            void inserAtEnd(int val) {
                  Node temp = new Node(val);
                  if (head == null) {
                        head = temp;

                  } else {
                        tail.Next = temp;

                  }
                  tail = temp;
                  size++;

            }

            void inserAthead(int val) {
                  Node temp = new Node(val);
                  if (head == null) {
                        head = tail = temp;

                  } else {
                        temp.Next = head;
                        head = temp;
                  }
                  size++;
            }

            void insertatremdom(int idx, int val) {
                  Node t = new Node(val);
                  Node temp = head;
                  if (idx == size) {
                        inserAtEnd(val);
                        return;
                  } else if (idx == 0) {
                        inserAthead(val);
                  } else if (idx > size) {
                        System.out.println("Worng index ");
                        return;
                  }
                  for (int i = 1; i <= idx - 1; i++) {
                        temp = temp.Next;
                  }
                  t.Next = temp.Next;
                  temp.Next = t;
                  size++;
            }

            int getAt(int idx) {
                  if (idx < 0 || idx > size) {
                        System.out.println("Wrong index");

                  }
                  return -1;
            }

            void deleteindex(int idx) {
                  Node temp = head;
                  for (int i = 0; i <= idx; i++) {
                        temp = temp.Next;
                  }
                  temp.Next = temp.Next.Next;
                  size--;
            }

            void display() {
                  Node temp = head;
                  while (temp != null) {
                        System.out.print(temp.data + " ");
                        temp = temp.Next;
                  }
                  System.out.println();
            }

            // int size() {
            // Node temp = head;
            // int count = 0;
            // while (temp != null) {
            // count++;
            // temp = temp.Next;
            // }
            // return count;
            // }

      }

      public static void main(String[] args) {
            linkedlist ll = new linkedlist();
            ll.inserAtEnd(4);
            ll.inserAtEnd(5);
            ll.display();
            ll.inserAtEnd(12);
            ll.display();
            ll.inserAthead(13);
            ll.display();
            ll.insertatremdom(2, 14);
            ll.display();
            ll.deleteindex(4);
            ll.display();
            System.out.println(ll.getAt(-8));
            System.out.println(ll.size);
      }

}
