package Queues.partone;

import java.util.*;

public class displayq {
      public static void main(String[] args) {
            Queue<Integer> q = new LinkedList<>();

            q.add(1);
            q.add(2);
            q.add(3);
            q.add(4);
            q.add(5);
            System.out.println(q);
            Queue<Integer> helper = new ArrayDeque<>();
            while (q.peek() != null && q.peek() > 0) {
                  System.out.print(q.peek() + " ");

                  helper.add(q.poll());
            }
            while (helper.size() > 0) {
                  q.add(helper.poll());
            }
      }
}
