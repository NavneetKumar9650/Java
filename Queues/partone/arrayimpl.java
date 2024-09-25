package Queues.partone;

public class arrayimpl {
      public static class Queue {
            int f = -1;
            int r = -1;
            int size = 0;
            int[] arr = new int[5];

            public void add(int val) {
                  if (r == arr.length - 1) {
                        System.out.println("Queue is full");
                        return;
                  }
                  if (f == -1) {
                        f = r = 0;
                        arr[0] = val;
                  }

                  else {
                        arr[++r] = val;

                  }
                  size++;
            }

            public int remove() {

                  if (size == 0) {
                        System.out.println("Q is empaty");
                        return -1;
                  }
                  f++;
                  size--;
                  return arr[f - 1];
            }

            public boolean isEmpaty() {
                  if (size == 0)
                        return true;
                  else
                        return false;
            }

            public int peek() {
                  if (size == 0) {
                        System.out.println("Queue is empty");
                        return -1;
                  }
                  return arr[f];
            }

            public void display() {
                  if (size == 0) {
                        System.out.println("Q is empaty");
                  } else {
                        for (int i = f; i <= r; i++) {
                              System.out.print(arr[i] + " ");
                        }
                  }
                  System.out.println();
            }
      }

      public static void main(String[] args) {
            Queue q = new Queue();
            q.display();
            q.add(1);
            q.add(2);
            q.add(3);
            q.add(4);
            q.add(5);
            q.display();
            q.remove();
            q.display();
            System.out.println(q.peek());
            q.display();
      }
}
