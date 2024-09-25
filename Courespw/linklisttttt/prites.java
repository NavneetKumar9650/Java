package Courespw.linklisttttt;

class Node {
      int val;
      Node next;

      Node(int val) {
            this.val = val;
            this.next = next;
      }
}

class SSl {
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

      void insertAtHead(int val){
        
            Node temp = new Node(val);
            if(head==null){
                  head=tail=temp;

            }else{
                  temp.next = head;
                  head =temp;
            }
            size++;
            
      }


      void insert(int idx, int val){
            if(idx==0){
                  insertAtEnd(val);
                  return;
            }
            if(idx==size){
                  insertAtEnd(val);
                  return;
            } if(idx >size || idx==0){
                  System.out.println("inveled code");
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

      void display() {
            Node temp = head;
            while (temp != null) {
                  System.out.println(temp.val);
                  temp = temp.next;
            }
      }

}

public class prites {
      public static void main(String[] args) {
            SLL list = new SLL();
            list.insertAtEnd(10);
            list.insertAtEnd(20);
            list.insertAtEnd(30);
            list.insertAtEnd(50);
            list.insertAtEnd(40);
            list.display();
            list.insertAtHead(55);
            list.display();
      }
}
