package Linklist;

import java.util.List;

public class kunallink {
    private Node head;
    private Node tail;
    private int size;

    class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }
        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }

    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        } else if (index == size - 1) {
            return deleteLast();
        }
        Node prev = get(index - 1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        size--;
        return val;
    }

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public int deleteFirst() {
        if (head == null) { // Check if the list is empty
            throw new RuntimeException("List is empty");
        }
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public void insertmiddle(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        } else if (index == size) {
            insertlast(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    public void insertFirst(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void insertlast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insertRec(int val, int index) {
        head = insertRec(val, index, head);
    }

    private Node insertRec(int val, int index, Node node) {
        if (index == 0) {
            Node temp = new Node(val, node);
            size++;
            return temp;
        }
        if (node == null) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        node.next = insertRec(val, index - 1, node.next);
        return node;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    public static kunallink merge(kunallink first, kunallink second) {
        Node f = first.head;
        Node s = second.head;

        kunallink ans = new kunallink();

        while (f != null && s != null) {
            if (f.value < s.value) {
                ans.insertlast(f.value);
                f = f.next;
            } else {
                ans.insertlast(s.value);
                s = s.next;
            }
        }
        while (f != null) {
            ans.insertlast(f.value);
            f = f.next;
        }
        while (s != null) {
            ans.insertlast(s.value);
            s = s.next;
        }

        return ans;
    }

    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        } while (slow != fast);

        return slow == 1;
    }

    private int findSquare(int number) {
        int ans = 0;
        while (number > 0) {
            int rem = number % 10;
            ans += rem * rem;
            number /= 10;
        }
        return ans;
    }

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode prev = null;
        ListNode present = head;
        ListNode next = present.next;

        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if (next != null) {
                next = next.next;
            }
        }

        return prev;
    }

    class ListNode {
        int val;
        ListNode next;

        public ListNode() {

        }
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right) {
            return head;
        }

        ListNode current = head;
        ListNode prev = null;
        for (int i = 0; current != null && i < left - 1; i++) {
            prev = current;
            current = current.next;
        }

        ListNode last = prev;
        ListNode newEnd = current;

        ListNode next = current.next;
        for (int i = 0; current != null && i < right - left + 1; i++) {
            current.next = prev;
            prev = current;
            current = next;
            if (next != null) {
                next = next.next;
            }
        }

        if (last != null) {
            last.next = prev;
        } else {
            head = prev;
        }
        newEnd.next = current;

        return head;
    }

    public boolean isPalindrome(ListNode head) {
        ListNode mid = middleNode(head);
        ListNode headSecond = reverseList(mid);
        ListNode rereveseHead = headSecond;

        // compare both the helves

        while (head != null && headSecond != null) {
            if (head.val != headSecond.val) {
                break;
            }
            head = head.next;
            headSecond = headSecond.next;
        }
        reverseList(rereveseHead);

        if (head == null || headSecond == null) {

        }

    }

    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length - 1;
        int div = n / 3;
        if (div <= 1) {
            System.out.println(div);
        } else {
            System.out.println("1");
        }
        return null;

    }

    public static void main(String[] args) {
        // kunallink first = new kunallink();
        // kunallink second = new kunallink();

        // first.insertlast(1);
        // first.insertlast(3);
        // first.insertlast(5);
        // second.insertlast(1);
        // second.insertlast(2);
        // second.insertlast(9);
        // second.insertlast(14);

        // kunallink ans = kunallink.merge(first, second);
        // ans.display();
        int[] nums = { 3, 2, 3 };
    }
}