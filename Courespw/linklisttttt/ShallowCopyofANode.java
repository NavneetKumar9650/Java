package Courespw.linklisttttt;

import Courespw.Linklist.Node;

public class ShallowCopyofANode {
      public static void main(String[] args) {
            Node a = new Node(100);
            System.out.println(a.val);
            Node temp =a;// shalw copyss
            System.out.println(temp.val);
      }
      
}
