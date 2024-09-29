package Linklist;

import java.util.HashMap;

public class Doubly {

      Node head;

      public void insertFirst(int val) {
            Node node = new Node(val);
            node.next = head;
            node.prev = null;
            if (head != null) {
                  head.prev = node;
            }
            head = node;
      }

      public void display() {
            Node node = head;
            while (node != null) {
                  System.out.print(node.val + " <-> ");
                  node = node.next;
            }
            System.out.println("null");
      }

      private class Node {
            int val;
            Node next;
            Node prev;

            public Node(int val) {
                  this.val = val;
            }

            public Node(int val, Node next, Node prev) {
                  this.val = val;
                  this.next = next;
                  this.prev = prev;
            }
      }

      public static boolean containsNearbyDuplicate(int[] nums, int k) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                  if (map.containsKey(nums[i]) && i - map.get(nums[i]) <= k) {
                        return true;
                  }
                  map.put(nums[i], i);
            }
            return false;
      }

      public static void main(String[] args) {
            // Doubly list = new Doubly();
            // list.insertFirst(3);
            // list.insertFirst(2);
            // list.insertFirst(8);
            // list.insertFirst(17);
            // list.display();
            int[] nums = { 1, 2, 3, 1 };
            int k = 2;
            containsNearbyDuplicate(nums, k);

      }
}
