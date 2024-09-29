package stack.level1;

public class LinkedListStack {

    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public static class LLStack {
        Node head = null;
        int size = 0;

        void push(int x) {
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }

        void pop() {
            if (head == null) {
                System.out.println("Stack is empty");
                return;
            }
            head = head.next;
            size--;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        boolean isEmpty() {
            return head == null;
        }

        int getSize() {
            return size;
        }
    }

    public static void main(String[] args) {
        LLStack st = new LLStack();
        st.push(4);
        st.display();
        st.push(5);
        st.display();
        st.push(1);
        st.display();
        System.out.println("Size: " + st.getSize());
        st.pop();
        st.display();
        System.out.println("Size: " + st.getSize());
        st.push(4);
        st.push(0);
        System.out.println("Is empty: " + st.isEmpty());
    }
}
