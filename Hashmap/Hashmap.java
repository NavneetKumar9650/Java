import java.util.*;

public class Hashmap {

      static class MyHashMap<K, V> {
            public static final int DEFULT_CAPACITY = 4;
            public static final float DEFULT_LOAD_FACTOR = 0.75f;

            private class Node {
                  K key;
                  V value;

                  Node(K key, V value) {
                        this.key = key;
                        this.value = value;
                  }

            }

            private int n;// the number of entrise in map

            private LinkedList<Node>[] buckets;

            private void intibuckets(int N) {// N is a capcity/size of bucked arrya
                  buckets = new LinkedList[N];
                  for (int i = 0; i < buckets.length; i++) {
                        buckets[i] = new LinkedList<>();
                  }
            }

            private int HashFunc(K key) {
                  int hc = key.hashCode();

                  return Math.abs(hc) % buckets.length;
            }

            // Traversesss the ll and looks for a node with key , if return it s index
            // otherwish it return null
            private int searchInBucket(LinkedList<Node> ll, K key) {
                  for (int i = 0; i < ll.size(); i++) {
                        if (ll.get(i).key == key) {
                              return i;
                        }
                  }
                  return -1;
            }

            public MyHashMap() {
                  intibuckets(DEFULT_CAPACITY);
            }

            public int size() {
                  return n; // return th e number of entries in map

            }

            public void put(K key, V value) { // insert, update

                  int bi = HashFunc(key);
                  LinkedList<Node> currBucket = buckets[bi];
                  int ei = searchInBucket(currBucket, key);
                  if (ei == -1) {// key dont exits ,we have to insert a new node
                        Node node = new Node(key, value);
                        currBucket.add(node);
                        n++;
                  } else {// update case
                        Node currNode = currBucket.get(ei);
                        currNode.value = value;
                  }
            }

            public V get(K key) {
                  int bi = HashFunc(key);
                  LinkedList<Node> currBucket = buckets[bi];
                  int ei = searchInBucket(currBucket, key); // Replace null with currBucket
                  if (ei != -1) { // key exists
                        Node currNode = currBucket.get(ei);
                        return currNode.value;
                  }
                  return null;
            }

            public V remove(K key) {
                  int bi = HashFunc(key);
                  LinkedList<Node> currBucket = buckets[bi];
                  int ei = searchInBucket(currBucket, key); // Replace null with currBucket
                  if (ei != -1) { // key exists
                        Node currNode = currBucket.get(ei);
                        V val = currNode.value;
                        currBucket.remove(ei);
                        n--;
                        return val;
                  }
                  return null;
            }

            public static void main(String[] args) {
                  MyHashMap<String, Integer> mp = new MyHashMap<>();
                  System.out.println("Testing put");
                  mp.put("a", 1);
                  mp.put("b", 2);
                  mp.put("c", 3);
                  System.out.println("Testing size" + mp.size());
                  mp.put("c", 30);
                  System.out.println("Testing size" + mp.size());

                  // Tesintg get so
                  System.out.println(mp.get("a"));
                  System.out.println(mp.get("b"));
                  System.out.println(mp.get("c"));


                  // remove 
                  
            }

      }

}